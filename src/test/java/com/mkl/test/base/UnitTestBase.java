package com.mkl.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

    /**
     * @program: demo
     *
     * @description:
     *
     * @author: makaloo
     *
     * @create: 2019-05-13 10:22
     **/

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() { }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.destroy();

    }

    @SuppressWarnings("unchecked")
    protected <T> T getBean(String beanId) {
        return (T)context.getBean(beanId);
    }

    protected <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
}
