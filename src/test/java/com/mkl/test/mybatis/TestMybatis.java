package com.mkl.test.mybatis;

import com.mkl.entity.Person;
import com.mkl.test.base.UnitTestBase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestMybatis extends UnitTestBase {

/**
 * @program: mybatisdemo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-29 09:14
 **/

    private void addPerson(SqlSession session, int id, String name, int age) {
        Person person = new Person(id, name, age);
        String statement = "com.mkl.entity.personMapper.addPerson";
        session.insert(statement, person);
        session.commit();
    }

    private Person queryPerson(SqlSession session, int id) {
        String statement = "com.mkl.entity.personMapper.queryPersonById";
        Person person = session.selectOne(statement, id);
        return person;
    }

    private List<Person> queryPersonsAll(SqlSession session) {
        String statement = "com.mkl.entity.personMapper.queryPersonByIdAll";
        List<Person> persons = session.selectList(statement);
        return persons;
    }

    @Test
    public void testMybatis() throws IOException {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
//        Person person = queryPerson(session, 1);
//        System.out.println(person);
//        addPerson(session, 2, "ls", 21);
//        Person person2 = queryPerson(session, 2);
//        System.out.println(person2);
        List<Person> list = queryPersonsAll(session);
        for(Person p : list)
            System.out.println(p);
        session.close();
    }
}