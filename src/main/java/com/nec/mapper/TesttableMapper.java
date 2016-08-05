package com.nec.mapper;

import java.awt.image.SampleModel;

import org.apache.ibatis.annotations.Select;

public interface TesttableMapper {

	@Select("select * from testtable where id = #{id}")
	public SampleModel select(int id);
}