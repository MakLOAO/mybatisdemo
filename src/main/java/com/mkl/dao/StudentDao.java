package com.mkl.dao;

import com.mkl.entity.Student;
import com.mkl.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class StudentDao {

    public List<Student> getStudents(boolean isResult) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement;
        if (isResult) // 两者实际作用是一样的
            statement = "com.mkl.entity.StudentMapper.getStudents";
        else
            statement = "com.mkl.entity.StudentMapper.getStudents2";
        List<Student> list = session.selectList(statement);
        session.close();
        return list;
    }

    public List<Student> getStudentsByObject(Map<String, Object> map) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement;
        statement = "com.mkl.entity.StudentMapper.getStudentsByObject";
        List<Student> students = session.selectList(statement, map);
        session.close();
        return students;
    }

}
