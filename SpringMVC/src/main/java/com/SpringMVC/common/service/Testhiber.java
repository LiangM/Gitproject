package com.SpringMVC.common.service;

import java.util.Date;

public class Testhiber {
	private int id;
	private String value;
	private Date Loaddate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getLoaddate() {
		return Loaddate;
	}

	public void setLoaddate(Date loaddate) {
		Loaddate = loaddate;
	}

	public Testhiber(int id, String value, Date loaddate) {
		this.id = id;
		this.value = value;
		Loaddate = loaddate;

	}
	
	public Testhiber() {
	}
}
