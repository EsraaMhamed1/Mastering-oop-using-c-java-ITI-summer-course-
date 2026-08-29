/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customexceptiondemo;

import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Genriv {
    public static void  main(String args[]){

         /************************************
                   Before Generics
          ************************************/ 
      

        /************************************
                  After Generics
        ************************************/ 
        ArrayList files = new ArrayList();

        files.add("file.txt");
        files.add("data.txt");

        String file = (String) files.get(0);
        System.out.println(file);

        
       }
    }
    

