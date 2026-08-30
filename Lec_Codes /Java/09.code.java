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

        // remove name :
        while (it.hasNext()) {

        String name = it.next();
    
        if (name.equals("Ali")) {
            it.remove();
        }
       /***************************************
                       Itretor 
       **************************************/
        
        Queue<String> queue;


        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new ArrayDeque<>();


            
            // collection -> ome element 
            List<String> students = new ArrayList<>();

            // Map: -> Key , value 
            Map<Integer, String> students = new HashMap<>();

            students.put(101, "Ali");
            students.put(102, "Mona");

            /***************************************
                              List 
           **************************************/
            List<String> list = new ArrayList<>();

            list.add("A");
            list.add("A");
            list.add("B");
            
            System.out.println(list);

            /***************************************
                               Set 
            **************************************/
            Set<String> set = new HashSet<>();

            set.add("A");
            set.add("A");
            set.add("B");
            
            System.out.println(set);

            
            /***************************************
                            TreeSet 
            **************************************/
            SortedSet<Integer> numbers = new TreeSet<>();

            numbers.add(30);
            numbers.add(10);
            numbers.add(20);
            
            System.out.println(numbers);

     
            /***************************************
                            TreeMap 
            **************************************/
            SortedMap<Integer, String> students = new TreeMap<>();

            students.put(103, "Sara");
            students.put(101, "Ali");
            students.put(102, "Mona");
            
            System.out.println(students);
      

            List<String> names = new ArrayList<>();


         /***************************************
                        LinkedList  
         **************************************/
         LinkedList<String> staff = new LinkedList<>();

        staff.add("First");
        staff.add("Second");
        staff.add("Third");

        Iterator<String> iter =
                staff.iterator();

        String first = iter.next();
        String second = iter.next();

        iter.remove();

        System.out.println(staff);
    


         /***************************************
                    LinkedList Methods
         **************************************/
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println(list.get(1));
        
        list.remove(1);
        
        System.out.println(list);


         /***************************************
                       ListIterator
         **************************************/
        List<String> names = new LinkedList<>();

        names.add("Ali");
        names.add("Mona");
        names.add("Sara");

        ListIterator<String> iterator =
                names.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println(iterator.previous());


            
         /***************************************
                 Concurrent Modification
         **************************************/
        List<String> list =
        new ArrayList<>(List.of("A", "B", "C"));

        for (String x : list) {
        
            if (x.equals("B")) {
                list.remove(x);
            }
        }    

        // resolve it : 
         List<String> list =
                new ArrayList<>(List.of("A", "B", "C"));

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            String x = iterator.next();

            if (x.equals("B")) {
                iterator.remove(); // ✅
            }
        }

        System.out.println(list);

         /***************************************
                   LinkedList Example
         **************************************/
         List<String> a = new LinkedList<>();

        a.add("A");
        a.add("B");
        a.add("C");
        
        List<String> b = new LinkedList<>();
        
        b.add("D");
        b.add("E");
        b.add("F");
        
        a.addAll(b);
        
        System.out.println(a);

        /***************************************
                    Merge + Remove
         **************************************/
         List<String> a =
                new ArrayList<>(List.of("A", "B", "C"));

        ListIterator<String> iter = a.listIterator();

        while (iter.hasNext()) {

            String value = iter.next();

            if (value.equals("B")) {
                iter.remove();
            }
        }

        System.out.println(a);
            

         /***************************************
                       removeIF
         **************************************/
         List<String> a =
                new LinkedList<>(
                    List.of("A", "D", "B", "E", "F", "G")
                );
        
          a.removeIf(x -> x.equals("B"));
          System.out.println(a);



         /***************************************
                      TreeMap
         **************************************/
            Map<Integer, String> map = new TreeMap<>();

            map.put(30, "Mona");
            map.put(10, "Ali");
            map.put(20, "Sara");
            
            System.out.println(map);

          /***************************************
                     HAshMap
          **************************************/
            class Employee {
            private String name;
        
            public Employee(String name) {
                this.name = name;
            }
        
            public String getName() {
                return name;
            }
        
            @Override
            public String toString() {
                return name;
            }
        }
        //  inside main : 
            Map<String, Employee> staff = new HashMap<>();

            staff.put("987-98-9996", new Employee("Harry"));
            staff.put("123-45-6789", new Employee("Mona"));
    
            Employee e = staff.get("987-98-9996");
    
            System.out.println(e);

            
          /***************************************
                    Iteration throw a map 
          **************************************/
            Map<String, Integer> scores = new HashMap<>();
            
            scores.put("Ali", 90);
            scores.put("Mona", 85);
            scores.put("Sara", 95);
            
            scores.forEach((name, score) ->
                System.out.println(name + " = " + score)
            );
                        

          /***************************************
                   Updating Map Entries
          **************************************/

            Map<String, Integer> counts = new HashMap<>();

            counts.put("Java", 1);
            
            counts.put("Java", counts.get("Java") + 1);
            
            System.out.println(counts);


           /***************************************
                          MapViews 
          **************************************/
            Map<String, Integer> map = new HashMap<>();
    
            map.put("Ali", 90);
            map.put("Mona", 85);
            map.put("Sara", 95);
    
            System.out.println(map.keySet());
            System.out.println(map.values());
            System.out.println(map.entrySet());

            
           /***************************************
                       Finding max     
          **************************************/

            List<Integer> numbers =
                    List.of(10, 40, 20, 70, 30);
            
            int max = Collections.max(numbers);
            
            System.out.println(max);

          /***************************************
                       Sorting     
          **************************************/
            List<Integer> numbers =
                    new ArrayList<>(List.of(40, 10, 30, 20));
            
            Collections.sort(numbers);
            
            System.out.println(numbers);

           /***************************************
                        Descending Order    
           **************************************/
            List<Integer> numbers =
                    new ArrayList<>(List.of(40, 10, 30, 20));
            
            Collections.sort(
                numbers,
                Comparator.reverseOrder()
            );
            
            System.out.println(numbers);

           /***************************************
                        Shuffling    
           **************************************/
            List<Integer> numbers =
                    new ArrayList<>(List.of(40, 10, 30, 20));
            
            Collections.shuffle(numbers);
            
            System.out.println(numbers);


           /***************************************
                       Binary Search    
           **************************************/
            List<Integer> numbers =
                    List.of(10, 20, 30, 40, 50);
            
            int index =
                Collections.binarySearch(numbers, 30);
            
            System.out.println(index);

     
           /***************************************
                       Binary Search    
           **************************************/
        
            
    }
        
    
}
