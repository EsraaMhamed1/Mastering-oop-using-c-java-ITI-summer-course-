/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture_10;

/**
 *
 * @author HP
 */
import java.util.*;

public class Main {
    public static void main(String args[]){
        
            /*********************************
                        filter()
            *********************************/
        List<Integer> numbers =
                List.of(10, 15, 20, 25, 30, 35);

        List<Integer> evenNumbers =
                numbers.stream()
                       .filter(number -> number % 2 == 0)
                       .toList();

        System.out.println(evenNumbers);


      
            /*********************************
                       sorted()
            *********************************/

        List<String> names =
                List.of("Omar", "Ali", "Mona", "Sara");
        
        List<String> result =
                names.stream()
                     .sorted()
                     .toList();
        
        System.out.println(result);

        // Reverse Order
        List<String> result =
                names.stream()
                     .sorted(Comparator.reverseOrder())
                     .toList();
        
        System.out.println(result);
        


            /*********************************
                        distinct()
            *********************************/
        List<Integer> numbers =
                List.of(10, 20, 10, 30, 20, 40);

        List<Integer> result =
                numbers.stream()
                       .distinct()
                       .toList();
        System.out.println(result);


            /*********************************
                       limit()
            *********************************/
        List<Integer> numbers =
                List.of(10, 20, 10, 30, 20, 40);
        List<Integer> result =
                numbers.stream()
                       .limit(3)
                       .toList();
        System.out.println(result);
        
         /***********************************
            Multiple Intermediate Operations
         ************************************/
        List<Integer> numbers =
                List.of(10, 20, 10, 30, 20, 40);
        List<Integer> result =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .distinct()
                       .sorted()
                       .limit(3)
                       .toList();
        
        System.out.println(result);


         /***********************************
                        peek()
         ************************************/
        List<Integer> numbers =
                List.of(10, 20, 10, 30, 20, 40);
        numbers.stream()
               .filter(n -> n > 10)
               .peek(n -> System.out.println("After filter: " + n))
               .map(n -> n * 2)
               .toList();


        /***********************************
                        peek()
         ************************************/



  
      
    }
    
}
