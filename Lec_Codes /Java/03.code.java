/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec2;

/**
 *
 * @author HP
 */
public class lec_3_prep {
    public static void main(String args[]){


      /**************************************
                Primitive Data types 
      **************************************/
//int
        int age = 22;
//double 
        double price = 99.99;
//float
        float temperature = 36.5f;
//char
        char grade = 'A';
//bool
        boolean isStudent = true;

        System.out.println(age);
        System.out.println(price);
        System.out.println(temperature);
        System.out.println(grade);
        System.out.println(isStudent);

        /**************************************
                    Literals in java 
        **************************************/
          public static void main(String args[]){
// Integer Literals
        int decimal = 10;
        int octal = 012;
        int hexadecimal = 0x15;
        int binary = 0b1010;
// Underscore
        int bigNumber = 1_000_000;
// Floating-point Literals
        double normal = 3.14;
        double scientific = 2E3;
// Float
        float f = 10.5f;
              
// Boolean
        boolean isStudent = true;
              
// Character
        char grade = 'A';
              
// Escape Sequences
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tJava");
        System.out.println("C:\\Java");
        System.out.println("\"Hello\"");

        System.out.println(decimal);
        System.out.println(octal);
        System.out.println(hexadecimal);
        System.out.println(binary);
        System.out.println(bigNumber);
        System.out.println(normal);
        System.out.println(scientific);
        System.out.println(f);
        System.out.println(isStudent);
        System.out.println(grade);


         /*************************************
                        Variables 
         *************************************/
        int x;
        x = 10;

        if (x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);

            x = y * 2;
        }

        System.out.println("x is " + x);


         /*************************************
                    type conversion  
         *************************************/
// automatic 
     int x = 10;
        double y = x;

        System.out.println("int = " +" " +  x);
        System.out.println("double = " +" "+ y);
        
//casting
        double x = 10.75;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);
              
//promotion
        byte a = 10;
        byte b = 20;

        int result = a + b;

        System.out.println(result);
              

        /*************************************
                        Arrays  
         *************************************/ 
// simple example 
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);

// change value of array 
        numbers[1] = 100;
        System.out.println(numbers[1]);
              
// array using new 
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
              
// array with for loop 
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

// sum of array elements 
        int[] numbers = {10, 20, 30, 40};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);
              
              
    }
    
}

/************************************************/
