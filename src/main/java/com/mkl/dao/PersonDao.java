package com.mkl.dao;

import com.mkl.entity.Person;
import com.mkl.util.MyBatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDao {

/**
 * @program: mybatisdemo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-06-05 16:07
 **/
    public List<Person> queryPersonPageMap(int currentPage, int pageSize) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement = "com.mkl.entity.personMapper.queryPageMap";
        Map<String ,Integer> map = new HashMap<String, Integer>();
        // startIndex为MySQL分页的偏移量，currentPage是第几页，pageSize是每页的size，也是返回记录行的最大数目
        // 基于它们的定义，currentPage和startIndex的关系为startIndex = (currentPage - 1) * pageSize
        map.put("startIndex", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<Person> list = session.selectList(statement, map);
        session.close();
        return list;
    }

    public List<Person> queryPersonPageRowBounds(int currentPage, int pageSize) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement = "com.mkl.entity.personMapper.queryPageRowBounds";
        RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
        List<Person> list = session.selectList(statement, null, rowBounds);
        session.close();
        return list;
    }

    public void addPerson(int id, String name, int age) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        Person person = new Person(id, name, age);
        String statement = "com.mkl.entity.personMapper.addPerson";
        session.insert(statement, person);
        session.commit();
        session.close();
    }

    public Person queryPerson(int id) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement = "com.mkl.entity.personMapper.queryPersonById";
        Person person = session.selectOne(statement, id);
        session.close();
        return person;
    }

    public List<Person> queryPersonsAll() throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement = "com.mkl.entity.personMapper.queryPersonByIdAll";
        List<Person> persons = session.selectList(statement);
        session.close();
        return persons;
    }

    public Person queryPersonByIdAndName(int id, String name) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement = "com.mkl.entity.personMapper.queryPersonById";
        Person person = new Person();
        person.setId(id);
        person.setName1("a");
        Person person2 = session.selectOne(statement, person);
        session.close();
        return person2;
    }
}
