package com.nec.spring_mybatis_sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.spring_mybatis_sample.mapper.TesttableMapper;
import com.nec.spring_mybatis_sample.model.TesttableModel;

@RestController
public class TestController {

	@Autowired
	TesttableMapper mapper;

	@RequestMapping(value = "/", method = GET)
	@Transactional
	public List<TesttableModel> show() {
		List<TesttableModel> list = mapper.selectAll();
		return list;
	}
}
