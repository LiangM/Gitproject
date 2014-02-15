package com.SpringMVC.common.service;

import java.util.Date;

public class Policy {

	private int policykey;
	private String policyno;
	private String mainrisk;
	private Date issuedate;
	private double prem;
	private String statecode;
	private String salechannel;
	private String agentcode;
	private Date loaddate;   
	
	public Policy() {
	}

	public int getPolicykey() {
		return policykey;
	}

	public void setPolicykey(int policykey) {
		this.policykey = policykey;
	}

	public String getPolicyno() {
		return policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public String getMainrisk() {
		return mainrisk;
	}

	public void setMainrisk(String mainrisk) {
		this.mainrisk = mainrisk;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public double getPrem() {
		return prem;
	}

	public void setPrem(double prem) {
		this.prem = prem;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getSalechannel() {
		return salechannel;
	}

	public void setSalechannel(String salechannel) {
		this.salechannel = salechannel;
	}

	public String getAgentcode() {
		return agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	public Date getLoaddate() {
		return loaddate;
	}

	public void setLoaddate(Date loaddate) {
		this.loaddate = loaddate;
	}
}
