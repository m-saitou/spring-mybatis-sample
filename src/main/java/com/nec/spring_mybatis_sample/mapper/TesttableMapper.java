package com.nec.spring_mybatis_sample.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.nec.spring_mybatis_sample.model.TesttableModel;

public interface TesttableMapper {
	@Insert("insert into testtable (id, count, accessdatetime) values(#{id}, #{count}, #{accessdatetime})")
	public void insert(TesttableModel model);

	@Select("select * from testtable where id = #{id}")
	public TesttableModel select(int id);

	@Select("select count(*) from testtable")
	public int selectCount();
}