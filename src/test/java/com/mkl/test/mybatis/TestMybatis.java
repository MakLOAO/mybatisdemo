package com.mkl.test.mybatis;

import com.mkl.dao.PersonDao;
import com.mkl.dao.PersonDaoI;
import com.mkl.dao.StudentDao;
import com.mkl.dao.TeacherDao;
import com.mkl.entity.Person;
import com.mkl.entity.Student;
import com.mkl.entity.Teacher;
import com.mkl.test.base.UnitTestBase;
import com.mkl.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        StudentDao studentDao = new StudentDao();
        // List<Student> students = studentDao.getStudentsByObject(null);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "zs");
        List<Student> students = studentDao.getStudentsByObject(map);
        for (Student s : students)
            System.out.println(s);
//        TeacherDao teacherDao = new TeacherDao();
//        Teacher teacher = teacherDao.getTeacher(1, false);
//        System.out.println(teacher);
//        StudentDao studentDao = new StudentDao();
//        List<Student> list = studentDao.getStudents(false);
//        for (Student s : list)
//            System.out.println(s);
//        SqlSession session = MyBatisUtil.getSqlSession();
//        PersonDaoI personDaoI = session.getMapper(PersonDaoI.class);
//        List<Person> list = personDaoI.getList();
//        for (Person person : list)
//            System.out.println(person);
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