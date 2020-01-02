/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spwithanno.service.impl;

import com.java.spwithanno.service.StudentService;
import org.springframework.stereotype.Service;

/**
 *
 * @author good
 */
@Service("studentservice")
public class StrudentServiceImpl implements StudentService{
    
    
      @Override
      public void getstudentinfo(){
          System.out.println("Hello Student !");
      
      }
}
