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
                filter()
    *********************************/

      
    }
    
}
