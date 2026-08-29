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
         ArrayList files = new ArrayList();

        files.add("file.txt");
        files.add("data.txt");
        files.add(10);

        String file = (String) files.get(0);
        System.out.println(file);
        /************************************
                  After Generics
        ************************************/ 
        
        ArrayList<String> files = new ArrayList<>();

        files.add("file1.txt");
        files.add("file2.txt");
//      files.add(10);
            
        String file = (String) files.get(0);
        System.out.println(file);

        
       

        
       }
    }
    

