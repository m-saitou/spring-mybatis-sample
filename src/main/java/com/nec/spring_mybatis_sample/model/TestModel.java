package com.nec.spring_mybatis_sample.model;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public class TestModel {
	private int id;
	private String name;

	@Column(name = "update_datetime")
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
