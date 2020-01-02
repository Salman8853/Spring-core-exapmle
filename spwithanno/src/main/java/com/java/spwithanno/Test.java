/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spwithanno;

import com.java.spwithanno.controller.StudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author good
 */
public class Test {
    public static void main(String[] args) {
         ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
         System.out.println("hello");
        StudentController studentcontroller=      ctx.getBean("studentcntr", StudentController.class);
        studentcontroller.displayStudentInfo();
    }
}
