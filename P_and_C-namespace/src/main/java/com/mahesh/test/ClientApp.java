package com.mahesh.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.beans.Emp;
public class ClientApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }
}
