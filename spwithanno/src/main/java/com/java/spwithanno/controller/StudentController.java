/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spwithanno.controller;

import com.java.spwithanno.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 *
 * @author good
 */
@Controller("studentcntr")
public class StudentController {
   @Autowired
   private StudentService studentservice;
    
    public void displayStudentInfo(){
    
       studentservice.getstudentinfo();
    
    }
    
}
