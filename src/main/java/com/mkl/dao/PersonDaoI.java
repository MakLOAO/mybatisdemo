package com.mkl.dao;

import com.mkl.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonDaoI {
    @Select("SELECT id, name name1, age FROM person")
    public List<Person> getList();

    @Insert("INSERT INTO user(id, name, age) VALUES(#{id}, #{name}, #{age})")
    public int insert(Person person);
}
