/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture_11;

/**
 *
 * @author HP
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /**********************************
                  create  Treads 
        **********************************/
        Thread t1 = new Thread(() ->
            System.out.println("Thread 1")
        );

        Thread t2 = new Thread(() ->
            System.out.println("Thread 2")
        );

        t1.start();
        t2.start();



        /**********************************
             2 ways to create Treads 
        **********************************/
        
        // 1. Extend the Thread class
        class MyThread extends Thread

        // Implement the Runnable interface
        class MyTask implements Runnable

            
        /**********************************
             Extending the Thread Class
        **********************************/

         class MyThread extends Thread {

              @Override
              public void run() {
                     System.out.println("Hello from MyThread");
                }
          }
        // inside main : 
        MyThread t = new MyThread();
        t.start();
        
            
        /**********************************
                  start() vs run()
        **********************************/

        class MyThread extends Thread {
        
            @Override
            public void run() {
                System.out.println(
                    Thread.currentThread().getName()
                );
            }
        }

        // inside main:
         MyThread t = new MyThread();
        t.run();
        t.start();

                  
        /**********************************
                  start() vs run()
        **********************************/


            
    }
    
}
