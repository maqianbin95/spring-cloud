package com.mqb.provider8001.providerdept.mapper;

import com.mqb.provider8001.providerdept.entity.Dept;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface DeptMapper {
    int deleteByPrimaryKey(Long deptId);


    @Select("select * from dept where dept_id = #{deptId}")
    @Results({
            @Result(column = "dept_id",property = "deptId"),
            @Result(column = "name",property = "name"),
            @Result(column = "db_source",property = "dbSource"),
    })
    Dept selectByPrimaryKey(Long deptId);

}