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
}
