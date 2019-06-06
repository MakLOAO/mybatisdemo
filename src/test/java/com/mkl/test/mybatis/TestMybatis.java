package com.mkl.test.mybatis;

import com.mkl.dao.PersonDao;
import com.mkl.dao.PersonDaoI;
import com.mkl.entity.Person;
import com.mkl.test.base.UnitTestBase;
import com.mkl.util.MyBatisUtil;
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

    @Test
    public void testMybatis() throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        PersonDaoI personDaoI = session.getMapper(PersonDaoI.class);
        List<Person> list = personDaoI.getList();
        for (Person person : list)
            System.out.println(person);
//        Person person = personDao.queryPerson(1);
//        System.out.println(person);
//        addPerson(session, 2, "ls", 21);
//        Person person2 = queryPerson(session, 2);
//        System.out.println(person2);
//        List<Person> list = queryPersonsAll(session);
//        for(Person p : list)
//            System.out.println(p);
//        session.close();
    }
}