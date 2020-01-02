/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spaoutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author good
 */
public class Body {
    
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
         Human human=  ctx.getBean("human", Human.class);
         human.startPumoing();
        
    }
}
