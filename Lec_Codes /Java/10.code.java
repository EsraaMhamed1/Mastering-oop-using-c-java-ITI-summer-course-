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

        
        /***********************************
                      min() and max()
         ************************************/

        
        Employee highestPaid =
        employees.stream()
                 .max(
                     Comparator.comparing(
                         Employee::getSalary
                     )
                 )
                 .orElseThrow();
           
         /***********************************
                  sum() and average()
         ************************************/
        // sum :
        double totalSalary =
             employees.stream()
                 .mapToDouble(Employee::getSalary)
                 .sum();

        // avg:
           double averageSalary =
               employees.stream()
                 .mapToDouble(Employee::getSalary)
                 .average()
                 .orElse(0.0);


            /***********************************
                          reduce()
            ************************************/
        
          List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);

        int product =
                numbers.stream()
                       .reduce(1, (a, b) -> a * b);

        System.out.println(product);

           /***********************************
                       collect.ToList() 
            ************************************/
        
        List<Integer> numbers =
                List.of(10, 20, 30, 40, 50);

        List<Integer> result =
                numbers.stream()
                       .filter(n -> n >= 30)
                       .collect(Collectors.toList());

        System.out.println(result);

            /***********************************
                       collect.toSet() 
            ************************************/
        
        List<Integer> numbers =
                List.of(10, 20, 10, 30, 20, 40);

        Set<Integer> result =
                numbers.stream()
                       .collect(Collectors.toSet());

        System.out.println(result);

         /***********************************
                    collect.joining() 
          ************************************/
         List<String> names =
                List.of("Ali", "Mona", "Omar", "Sara");

        String result =
                names.stream()
                     .collect(Collectors.joining(", "));

        System.out.println(result);


         /***********************************
                  collect.groupingBy() 
          ************************************/
        // employee example : 
         Map<String, List<Employee>> employeesByName =
        employees.stream()
                 .collect(
                     Collectors.groupingBy(
                         Employee::getName
                     )
                 );
        System.out.println(employeesByName);


        
         /***********************************
                 collect.partitioningBy() 
          ************************************/
        Map<Boolean, List<Employee>> result =
        employees.stream()
                 .collect(
                     Collectors.partitioningBy(
                         e -> e.getSalary() > 200000
                     )
                 );


        
          /***********************************
                    summarizingDouble
          ************************************/
        // employee : 
        DoubleSummaryStatistics stats =
            employees.stream()
                     .collect(
                         Collectors.summarizingDouble(
                             Employee::getSalary
                         )
                     );
        
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());


          /***********************************
                    reducing 
          ************************************/
         List<Employee> employees = Arrays.asList(
                new Employee(1, "Ali", 100000),
                new Employee(2, "Mona", 250000),
                new Employee(3, "Omar", 150000),
                new Employee(4, "Sara", 300000)
        );

        Optional<Employee> highestPaid =
                employees.stream()
                         .collect(
                             Collectors.reducing(
                                 (e1, e2) ->
                                     e1.getSalary() > e2.getSalary()
                                     ? e1
                                     : e2
                             )
                         );

         highestPaid.ifPresent(
                employee ->
                        System.out.println(
                                "Highest Paid: " + employee
                        )
        );


        /***********************************
                    files  
          ************************************/
        // import java.io.IOException;
        // import java.nio.file.Files;
        // import java.nio.file.Path;
        Path file = Path.of("input.txt");

        try (var lines = Files.lines(file)) {

            lines.filter(line -> !line.isBlank())
                 .forEach(System.out::println);

        } catch (IOException e) {

            System.out.println(
                    "Error reading file: " + e.getMessage()
            );
        }
        
        
          /***********************************
                    reducing 
          ************************************/
        
    }
    
}
