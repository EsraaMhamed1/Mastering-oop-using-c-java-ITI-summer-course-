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
                       Employee
         ************************************/
        class Employee{
            private int id;
            private String name;
            private double salary;
        
            public Employee(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }
        
            public int getId() {
                return id;
            }
        
            public String getName() {
                return name;
            }
        
            public double getSalary() {
                return salary;
            }
        
            @Override
            public String toString() {
                return name + " - " + salary;
            }
        }

        // inside main : 
         List<Employee> employees = Arrays.asList(
                        new Employee(1, "Jeff Bezos", 100000),
                        new Employee(2, "Bill Gates", 200000),
                        new Employee(3, "Mark Zuckerberg", 300000),
                        new Employee(4, "Elon Musk", 250000)
                );
         
         System.out.println(employees);

         /***********************************
                       Employee
         ************************************/


        employees.stream()
         .forEach(employee ->
                 System.out.println(employee.getName()));



        List<Employee> highPaidEmployees =
        employees.stream()
                 .filter(employee -> employee.getSalary() > 200000)
                 .toList();


        List<String> employeeNames =
        employees.stream()
                 .map(employee -> employee.getName())
                 .toList();

        /***********************************
                       Filter Then Map
         ************************************/
            List<String> highPaidNames =
                employees.stream()
                         .filter(employee -> employee.getSalary() > 200000)
                         .map(Employee::getName)
                         .toList();


        /***********************************
                       Sorting Employees
         ************************************/
        List<Employee> sortedEmployees =
        employees.stream()
                 .sorted(Comparator.comparing(Employee::getSalary))
                 .toList();
        
        
        /***********************************
             Sorting in Descending Order
         ************************************/
        
        List<Employee> sortedEmployees =
        employees.stream()
                 .sorted(
                     Comparator.comparing(Employee::getSalary)
                               .reversed()
                 )
                 .toList();



        
        /***********************************
                    Filter, Map & Sort
         ************************************/
           List<Employee> employees = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000),
                new Employee(2, "Bill Gates", 200000),
                new Employee(3, "Mark Zuckerberg", 300000),
                new Employee(4, "Elon Musk", 250000)
        );

        List<String> result =
                employees.stream()
                         .filter(employee ->
                                 employee.getSalary() > 150000)
                         .sorted(
                                 Comparator.comparing(
                                         Employee::getSalary
                                 ).reversed()
                          )
                         .map(Employee::getName)
                         .toList();

        result.forEach(System.out::println);


        
        /***********************************
                      count()
         ************************************/

        long count =
        employees.stream()
                 .filter(e -> e.getSalary() > 150000)
                 .count();
           
 
           
    }
    
}
