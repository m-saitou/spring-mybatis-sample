package com.nec.spring_mybatis_sample.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TestModel {
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "update_datetime")
	private Timestamp updateDatetime;

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

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
}
