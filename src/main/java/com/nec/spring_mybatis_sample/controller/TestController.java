package com.nec.spring_mybatis_sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nec.spring_mybatis_sample.mapper.TesttableMapper;
import com.nec.spring_mybatis_sample.model.TesttableModel;

@Controller
public class TestController {

	@Autowired
	TesttableMapper mapper;

	@RequestMapping(value = "/", method = GET)
	@Transactional
	public String show() {
		int count = mapper.selectCount();

		TesttableModel model = new TesttableModel();
		model.setId(count + 1);
		model.setCount(count + 1);
		model.setAccessdatetime(new Date());

		mapper.insert(model);

		return "test";
	}
}
