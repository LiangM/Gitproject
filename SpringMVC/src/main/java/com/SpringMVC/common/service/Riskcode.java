package com.SpringMVC.common.service;

import java.util.Date;

public class Riskcode {
	private int riskkey;
	private String riskcode;
	private String riskname;
	private Date loaddate;

	public Riskcode(int riskkey, String riskcode, String riskname,
			Date loaddate) {
		this.setRiskkey(riskkey);
		this.setRiskcode(riskcode);
		this.setRiskname(riskname);
		this.setLoaddate(loaddate);
	}

	public int getRiskkey() {
		return riskkey;
	}

	public void setRiskkey(int riskkey) {
		this.riskkey = riskkey;
	}

	public String getRiskcode() {
		return riskcode;
	}

	public void setRiskcode(String riskcode) {
		this.riskcode = riskcode;
	}

	public String getRiskname() {
		return riskname;
	}

	public void setRiskname(String riskname) {
		this.riskname = riskname;
	}

	public Date getLoaddate() {
		return loaddate;
	}

	public void setLoaddate(Date loaddate) {
		this.loaddate = loaddate;
	}
}
