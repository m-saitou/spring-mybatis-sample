package com.nec.spring_mybatis_sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.nec.spring_mybatis_sample.model.TestModel;

public interface TestMapper {
	@Insert("insert into test (name) values(#{model.name})")
	public int insert(@Param("model") TestModel model);

	@Results({ @Result(property = "updateDatetime", column = "update_datetime") })
	@Select("select * from test where id = #{id}")
	public TestModel select(@Param("id") int id);

	@Results({ @Result(property = "updateDatetime", column = "update_datetime") })
	@Select("select * from test order by id")
	public List<TestModel> selectAll();

	@Delete("delete from test where id = #{id}")
	public void delete(@Param("id") int id);

	@Select("select last_insert_id() from test")
	public int selectLastId();
}