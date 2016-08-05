package com.nec.spring_mybatis_sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nec.spring_mybatis_sample.mapper.TestMapper;
import com.nec.spring_mybatis_sample.model.TestModel;

@RestController
public class TestController {

	@Autowired
	TestMapper mapper;

	@RequestMapping(value = "/", method = GET)
	@Transactional
	@ResponseBody
	public List<TestModel> show() {
		List<TestModel> list = mapper.selectAll();
		if (list == null) {
			list = new ArrayList<TestModel>();
		}
		return list;
	}

	@RequestMapping(value = "/", method = POST)
	@Transactional
	@ResponseBody
	public int insert(@RequestBody TestModel model) {
		int id = mapper.insert(model);

		return id;
	}

	@RequestMapping(value = "/{id}", method = GET)
	@Transactional
	@ResponseBody
	public TestModel get(@PathVariable int id) {
		TestModel model = mapper.select(id);
		return model;
	}

	@RequestMapping(value = "/{id}", method = DELETE)
	@Transactional
	@ResponseBody
	public void delete(@PathVariable int id) {
		mapper.delete(id);
	}
}
