package com.nec.spring_mybatis_sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TestModel {
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "update_datetime")
	private String updateDatetime;

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

	public String getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(String updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
}
