package com.sunglowsys.test;

import com.sunglowsys.configuration.JavaConfig;

import com.sunglowsys.domain.Student;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = (Student) context.getBean(Student.class);
        System.out.println();

        student.setFirstName("Hirdesh");
        student.setLastName("Kumar");
        student.setEmail("hk@gmail.com");
        student.setMobile("6397078496");
        student.setStandard("B.Sc");

        System.out.println(" FirstName:" +student.getFirstName());
        System.out.println(" LastName:" +student.getLastName());
        System.out.println("Email:" +student.getEmail());
        System.out.println("Mobile:" +student.getMobile());
        System.out.println("Standard" +student.getStandard());
        System.out.println();
        student.newAddress();
        }
    }

