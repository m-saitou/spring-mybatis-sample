package com.nec.spring_mybatis_sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.nec.spring_mybatis_sample.model.TestModel;

public interface TestMapper {
	@Insert("insert into test (name) values(#{name})")
	public int insert(TestModel model);

	@Select("select * from test where id = #{id}")
	public TestModel select(int id);

	@Select("select * from test order by id")
	public List<TestModel> selectAll();

	@Delete("delete from test where id = #{id}")
	public void delete(int id);
}