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
                Implementing Runnable
        **********************************/

        class MyTask implements Runnable {

            @Override
            public void run() {
                System.out.println("Task is running");
            }
        }
        
        // inside main : 
        Runnable task = new MyTask();
        
        Thread t = new Thread(task);
        
        t.start();

              
        /**********************************
                Lambda Expressions
        **********************************/

        // inside main : 
        Runnable task = () -> {
            System.out.println("Task is running");
        };

        Thread t = new Thread(task);

        t.start();
        
        
        new Thread(() -> {
            System.out.println("Hello from Thread");
             }).start();


              
        /**********************************
              Running Multiple Threads
        **********************************/

        Runnable task = () -> {
        
            for (int i = 1; i <= 5; i++) {
        
                System.out.println(
                    Thread.currentThread().getName()
                    + " : " + i
                );
            }
        };
        
        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");
        
        t1.start();
        t2.start();

        
        /**********************************
             Getting the Current Thread
        **********************************/

        Thread current = Thread.currentThread();

        System.out.println(current.getName());

          
        /**********************************
          Handling InterruptedException
        **********************************/

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
         
          
        /**********************************
                  Thread.sleep() 
        **********************************/

        System.out.println("Start");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End");       


   
        /**********************************
                  Thread.join() 
        **********************************/

        Thread worker = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                System.out.println("Worker: " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        worker.start();

        try {
            worker.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main: Worker finished!");

   
        /**********************************
                  without join() 
        **********************************/

        Thread worker = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                System.out.println("Worker: " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        worker.start();

        System.out.println("Main: Worker finished!");


        /**********************************
                  Digital Clock 
        **********************************/

        class ClockTask implements Runnable {

            @Override
            public void run() {
        
                while (true) {
        
                    System.out.println(
                        java.time.LocalTime.now()
                    );
        
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        }
        // inside main : 
         Thread clock =
            new Thread(new ClockTask(), "Clock");

        clock.start();


        /**********************************
                  Digital Clock 
        **********************************/
         class DateTimeApp extends JFrame
         implements Runnable {
        
            private Thread thread;
        
            public DateTimeApp() {
        
                setTitle(new Date().toString());
        
                thread = new Thread(this);
                thread.start();
            }
        
            @Override
            public void run() {
        
                while (true) {
        
                    setTitle(new Date().toString());
        
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
         }
    // inside main : 
        DateTimeApp app = new DateTimeApp();

        app.setBounds(500, 200, 500, 300);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   }
    
}
