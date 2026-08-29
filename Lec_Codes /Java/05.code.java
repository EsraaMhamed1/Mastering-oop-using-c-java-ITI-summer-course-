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

        
        /************************************
                  Generic class
        ************************************/ 
        class Pair<T> {
        private T first;
        private T second;
    
        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }
    
        public T getFirst() {
            return first;
        }
    
        public T getSecond() {
            return second;
        }
    }

       //  Pair<String> p1;  //  T = String 
        Pair<String> p1 =
        new Pair<>("Hello", "Java");
    
        String x = p1.getFirst();
        System.out.println(x);
     
        
       /************************************
                  Generic Method
        ************************************/ 
         public static <T> void print(T value) {
         System.out.println(value);

        print("hello"); 
        print(100);
        print(10.5); 

        /************************************
                 Bounded Type Parameters
        ************************************/ 

        class Calculator<T extends Number> {

        private T number;
    
        public Calculator(T number) {
            this.number = number;
        }
    
        public double square() {
            double value = number.doubleValue();
            return value * value;
        }
    }

        // main 
        Calculator<Integer> c1 =
                new Calculator<>(5);

        Calculator<Double> c2 =
                new Calculator<>(2.5);

        System.out.println(c1.square());
        System.out.println(c2.square());


         /************************************
                     Multi Bounded 
        ************************************/
        interface Printable {
            void print();
        }
        
        interface Showable {
            void show();
        }
        
        class Report implements Printable, Showable {
        
            public void print() {
                System.out.println("Printing report");
            }
        
            public void show() {
                System.out.println("Showing report");
            }
        }
        
        class Processor<T extends Report & Printable & Showable> {
        
            public void process(T item) {
                item.print();
                item.show();
            }
        }
        
        // main 
           Processor<Report> p = new Processor<>();
           p.process(new Report());
           
        
        /************************************
                    Lambda Expression 
        ************************************/
         interface MyValue {
            double getValue();
        }

        // in main 
        MyValue value = () -> 98.6;

        System.out.println("Value = " + value.getValue());

        
         /************************************
                 Lambda with prameters 
        ************************************/
        interface Calculator {
            int calculate(int a, int b);
        }

        // in main 
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(10, 20));

        
        /************************************
           one interface & Multible Lambda 
        ************************************/

        interface NumericTest {
            boolean test(int n, int m);
        }

        // in main : 
        // Check if m is a factor of n
        NumericTest isFactor =
            (n, m) -> (n % m) == 0;

        System.out.println(isFactor.test(10, 2));

        // Check if n is less than m
        NumericTest isLessThan =
            (n, m) -> n < m;

        System.out.println(isLessThan.test(10, 20));

        // Check if absolute values are equal
        NumericTest absEqual =
            (n, m) -> Math.abs(n) == Math.abs(m);

        System.out.println(absEqual.test(4, -4));


        /************************************
                Block Lambda Example 
        ************************************/

        interface Calculator {
            int calculate(int a, int b);
        }
       // in main : 
        
        Calculator multiply = (a, b) -> {
            int result = a * b;
            return result;
        };

        System.out.println(multiply.calculate(5, 4));


        
       }
    }
    

