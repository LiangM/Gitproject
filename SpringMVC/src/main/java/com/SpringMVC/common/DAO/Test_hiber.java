package com.SpringMVC.common.DAO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "test_hiber")
public class Test_hiber {

	private int timekey;
	private String value;
	private Date load_date;

	public Test_hiber() {
	}

	public Test_hiber(int timekey, String value,Date load_date) {
		this.setTimekey(timekey);
		this.setValue(value);
		this.setLoad_date(load_date);
	}
	
	@Id
	@Column(name = "timekey", precision = 15, scale = 0)
	public int getTimekey() {
		return timekey;
	}

	public void setTimekey(int timekey) {
		this.timekey = timekey;
	}

	@Column(name = "value", length = 10)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "load_date", length = 7)
	public Date getLoad_date() {
		return load_date;
	}

	public void setLoad_date(Date load_date) {
		this.load_date = load_date;
	}

	
}
