/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spaoutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author good
 */
public class Human {
    
    @Autowired
    private Heart heart;
    
//    public void setHeart(Heart heart) {
//        System.out.println("dependency injected via setter");
//        this.heart = heart;
//    }

//    public Human() {
//        
//    }
//    
//    public Human(Heart heart) {
//   System.out.println("dependency injected via construtor");
//        this.heart = heart;
//    }
//    
    
    
    public void startPumoing(){
       if(heart!=null){
         heart.pump();
       }else{
           System.out.println("you are dead");
         }
      
    }
}
