package com.demo.dao.mapper;

import com.demo.dao.model.Person;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapperExt extends PersonMapper {
    @Select("select * from person")
    List<Person> selectAll();
}
