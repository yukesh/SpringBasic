package com.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basics.beans.HelloWorldBean;

/**
 * Hello world!
 *
 */
public class MainApp {
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("AppBeans.xml");
    	HelloWorldBean hwBean = (HelloWorldBean) context.getBean("helloWorld");
    	hwBean.getMessage();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
