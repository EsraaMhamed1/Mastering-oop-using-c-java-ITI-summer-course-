/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author HP
 */


public class Main {
    public static void main(String args[]){


      /***************************************
                   Collection 
       **************************************/
        // import java.util.ArrayList;
        ArrayList<String> students = new ArrayList<>();

        students.add("Ahmed");
        students.add("Mona");
        students.add("Ali");

        System.out.println(students);


       /***************************************
                       Itretor 
       **************************************/

        // import java.util.*; 
        Collection<String> names = new ArrayList<>();

        names.add("Ahmed");
        names.add("Mona");
        names.add("Ali");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }


       /***************************************
                       Itretor 
       **************************************/
        
        Queue<String> queue;


        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new ArrayDeque<>();

        
                
    }
    
}
