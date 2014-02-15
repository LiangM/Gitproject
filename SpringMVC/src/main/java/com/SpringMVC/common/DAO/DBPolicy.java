package com.SpringMVC.common.DAO;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "POLICY")
public class DBPolicy {

	private int policykey;
	private String policyno;
	private String mainrisk;
	private Date issuedate;
	private double prem;
	private String statecode;
	private String salechannel;
	private String agentcode;
	private Date loaddate;   
	
	public DBPolicy() {
	}

	@Id
	@Column(name = "POLICYKEY",length = 15)
	public int getPolicykey() {
		return policykey;
	}

	public void setPolicykey(int policykey) {
		this.policykey = policykey;
	}

	@Column(name="POLICYNO",length = 10)
	public String getPolicyno() {
		return policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	@Column(name="MAINRISK",length = 4)
	public String getMainrisk() {
		return mainrisk;
	}

	public void setMainrisk(String mainrisk) {
		this.mainrisk = mainrisk;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="HOISSDTE",length = 7)
	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	@Column(name = "PREM", precision = 17, scale = 2)
	public double getPrem() {
		return prem;
	}

	public void setPrem(double prem) {
		this.prem = prem;
	}

	@Column(name="STATECODE",length = 2)
	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	@Column(name="CHDRCHANNEL",length = 2)
	public String getSalechannel() {
		return salechannel;
	}

	public void setSalechannel(String salechannel) {
		this.salechannel = salechannel;
	}

	@Column(name="AGENTCODE",length = 10)
	public String getAgentcode() {
		return agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="LOAD_DATE",length = 7)
	public Date getLoaddate() {
		return loaddate;
	}

	public void setLoaddate(Date loaddate) {
		this.loaddate = loaddate;
	}
}
