package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class IOCTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Date now=(Date)context.getBean("now");
        System.out.println(now);

    }
}
