package com.mkl.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

/**
 * @program: mybatisdemo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-06-05 16:03
 **/
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() throws IOException {
        return getSqlSessionFactory().openSession();
    }
}
