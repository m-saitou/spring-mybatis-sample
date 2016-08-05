package com.nec.spring_mybatis_sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nec.spring_mybatis_sample.mapper.TesttableMapper;
import com.nec.spring_mybatis_sample.model.TesttableModel;

@RestController
public class TestController {

	@Autowired
	TesttableMapper mapper;

	@RequestMapping(value = "/", method = GET)
	@Transactional
	@ResponseBody
	public List<TesttableModel> show() {
		List<TesttableModel> list = mapper.selectAll();
		if (list == null) {
			list = new ArrayList<TesttableModel>();
		}
		return list;
	}

	@RequestMapping(value = "/", method = PUT)
	@Transactional
	@ResponseBody
	public int insert(TesttableModel model) {
		int count = mapper.selectCount() + 1;
		model.setCount(count);
		model.setAccessdatetime(new Date());

		mapper.insert(model);

		return count;
	}
}
