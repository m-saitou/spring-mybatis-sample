package com.nec.spring_mybatis_sample.model;

import java.util.Date;

import lombok.Data;

@Data
public class TestModel {
	private int id;
	private String name;
	private Date updateDatetime;
}
