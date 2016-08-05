package com.nec.spring_mybatis_sample.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TestModel {
	private int id;

	private String name;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDatetime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
}
