/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author srinivas.l
 */
import java.lang.*; 
import java.util.Properties; 
import java.util.*;  
import java.io.*;  
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        System.out.println("Hello...........$$$$$$$$$$$@@@@@@@@@@#####----Application started");
        System.out.println(" JAVA :: "+System.getProperty("java.home"));
        System.out.println(" JAVA :: "+System.getProperty("db.user"));
        FileReader reader=new FileReader("JavaApplication3/nbproject/app.properties");  
      
        Properties p=new Properties();  
        p.load(reader);  
      
    System.out.println(p.getProperty("db.user"));  
    System.out.println("Ok..Good");
    }
    
}
