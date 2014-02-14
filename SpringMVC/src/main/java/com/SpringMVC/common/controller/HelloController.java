package com.SpringMVC.common.controller;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.common.DAO.D_riskcode;
import com.SpringMVC.common.DAO.Test_hiber;
import com.SpringMVC.common.Validator.FormValidator;
import com.SpringMVC.common.service.Car;
import com.SpringMVC.common.service.Riskcode;
import com.SpringMVC.common.service.Testhiber;
import com.SpringMVC.util.HibernateUtil;

@Controller
public class HelloController {
	FormValidator formValidator;

	@Autowired
	public HelloController(FormValidator formValidator) {
		this.formValidator = formValidator;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ModelAndView TestInsert(ModelMap model) {
		Testhiber testhiber = new Testhiber();
		return new ModelAndView("TestInsert").addObject(testhiber);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	 public String FormOnSubmit(@ModelAttribute Testhiber testhiber, Model model,BindingResult result, SessionStatus status) {
        model.addAttribute("testhiber", testhiber);
        formValidator.validate(testhiber, result);
        
		if (result.hasErrors()) {
			return "TestInsert";
		} else {
        Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Test_hiber test_hiber = new Test_hiber();
 
		test_hiber.setTimekey(testhiber.getId());
		test_hiber.setValue(testhiber.getValue());
		test_hiber.setLoad_date(new Date());
 
		session.save(test_hiber);
		session.getTransaction().commit();
        
        return "result";
		}
    }

	@RequestMapping("/welcome")
	public ModelAndView printWelcome(ModelMap model) {
		return new ModelAndView("welcome", "car", new Car((long) 1, "BMW",
				"Z4", 200000.0));

	}

	@RequestMapping("/index")
	public ModelAndView index(ModelMap model) {

		ArrayList<Car> list = new ArrayList<Car>();
		list.add(new Car((long) 1, "BMW", "Z4", 200000.0));
		list.add(new Car((long) 1, "Toyota", "GTR", 230000.0));
		return new ModelAndView("hello", "cars", list);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/hiber",method = RequestMethod.GET)
	public ModelAndView hiberGet(ModelMap model) {
		ArrayList rlist = new ArrayList();	 
		ModelAndView model_view = new ModelAndView("D_riskcode", "risks", rlist);
		return model_view;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/hiber",method = RequestMethod.POST)
	public ModelAndView hiber(ModelMap model) {
		ArrayList rlist = new ArrayList();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ArrayList risklist = (ArrayList) session.createQuery(
					"FROM D_riskcode").list();

			for (Iterator iterator = ((java.util.List) risklist).iterator(); iterator
					.hasNext();) {
				D_riskcode d_riskcode = (D_riskcode) iterator.next();
				Riskcode r = new Riskcode(d_riskcode.getRiskkey(),
						d_riskcode.getRiskcode(), d_riskcode.getRiskname(),
						d_riskcode.getLoaddate());
				// System.out.println(d_riskcode.getRiskcode()+" "+d_riskcode.getRiskname());
				rlist.add(r);
			}

			rlist = risklist;
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		 
		ModelAndView model_view = new ModelAndView("D_riskcode", "risks", rlist);
		return model_view;
	}
}
