package com.nec.spring_mybatis_sample.model;

import java.util.Date;

public class TesttableModel {

	private int id;

	private int count;

	private Date accessdatetime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getAccessdatetime() {
		return accessdatetime;
	}

	public void setAccessdatetime(Date accessdatetime) {
		this.accessdatetime = accessdatetime;
	}
}
