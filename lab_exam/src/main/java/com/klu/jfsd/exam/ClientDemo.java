package com.klu.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Setter Autowiring Dependency Injection
        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}