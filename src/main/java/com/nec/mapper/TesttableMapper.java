package com.nec.mapper;

public interface TesttableMapper {
  
  @Select("select * from testtable where id = #{id}")
  public SampleModel select(int id);
}