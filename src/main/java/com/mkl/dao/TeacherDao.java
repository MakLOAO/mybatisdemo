package com.mkl.dao;

import com.mkl.entity.Student;
import com.mkl.entity.Teacher;
import com.mkl.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class TeacherDao {

/**
 * @program: mybatisdemo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-06-06 09:55
 **/
    public Teacher getTeacher(int id, boolean isResult) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        String statement;
        if (isResult)
            statement = "com.mkl.entity.TeacherMapper.getTeacher";
        else
            statement = "com.mkl.entity.TeacherMapper.getTeacher2";
        Teacher teacher = session.selectOne(statement, id);
        session.close();
        return teacher;
    }
}
