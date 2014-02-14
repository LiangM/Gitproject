package com.SpringMVC.common.DAO;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "D_riskcode")
public class D_riskcode {

	private int riskkey;
	private String riskcode;
	private String riskname;
	private Date loaddate;

	public D_riskcode() {
	}

	public D_riskcode(int riskkey, String riskcode, String riskname,
			Date loaddate) {
		this.riskkey = riskkey;
		this.riskcode = riskcode;
		this.riskname = riskname;
		this.loaddate = loaddate;
	}

	@Id
	@Column(name = "riskkey", unique = true, nullable = false, precision = 15, scale = 0)
	public int getRiskkey() {
		return this.riskkey;
	}

	public void setRiskkey(int riskkey) {
		this.riskkey = riskkey;
	}

	@Column(name = "riskcode", nullable = false, length = 5)
	public String getRiskcode() {
		return this.riskcode;
	}

	public void setRiskcode(String riskcode) {
		this.riskcode = riskcode;
	}

	@Column(name = "riskcname", length = 50)
	public String getRiskname() {
		return this.riskname;
	}

	public void setRiskname(String riskname) {
		this.riskname = riskname;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "load_date", length = 7)
	public Date getLoaddate() {
		return this.loaddate;
	}

	public void setLoaddate(Date loaddate) {
		this.loaddate = loaddate;
	}

}
