package lec2;

/**
 *
 * @author HP
 */
public class lec_3_prep {
    public static void main(String args[]){
      /************************************
                Arthimetic operators 
      ************************************/
      int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

      // increment & decrement 
        int x = 5;
        System.out.println("x = " + x);

        x++;
        System.out.println("After x++ = " + x);

        x--;
        System.out.println("After x-- = " + x);

        // postfix & prefix 
        int x = 5;

        System.out.println(x++);
        System.out.println(x);

      /************************************
                assignment operators  
      ************************************/
        int x = 10;

        x += 5;
        System.out.println("x += 5 : " + x);

        x -= 3;
        System.out.println("x -= 3 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        x /= 4;
        System.out.println("x /= 4 : " + x);

        x %= 3;
        System.out.println("x %= 3 : " + x);


       /************************************
               Bitwise operators   
      ************************************/
        
        int a = 5;
        int b = 3;

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // sheft operators 
        int x = 5;

        System.out.println("x << 1 = " + (x << 1));
        System.out.println("x << 2 = " + (x << 2));

        System.out.println("x >> 1 = " + (x >> 1));
        System.out.println("x >> 2 = " + (x >> 2));

       /************************************
               Relational operators   
      ************************************/

        int age = 20;

        System.out.println(age == 20);
        System.out.println(age != 20);
        System.out.println(age > 18);
        System.out.println(age < 18);
        System.out.println(age >= 18);
        System.out.println(age <= 18);


        /************************************
               Logical operators   
       ************************************/
        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID);
        System.out.println(age >= 18 || hasID);
        System.out.println(!hasID);


         /************************************
               Ternary operators   
        ************************************/ 
         int age = 20;

        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result);

         /************************************
               instanceof operators   
        ************************************/ 

          class A {
            int i, j;
        }

        class B {
            int i, j;
        }

        class C extends A {
            int k;
        }

        class D extends A {
            int k;
        }

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is instance of A");

        if (b instanceof B)
            System.out.println("b is instance of B");

        if (c instanceof C)
            System.out.println("c is instance of C");

        if (c instanceof A)
            System.out.println("c can be cast to A");

//        if (c instanceof D)
//            System.out.println("c can be cast to D");

        A ob;

        ob = d;

        System.out.println("ob now refers to d");

        if (ob instanceof D)
            System.out.println("ob is instance of D");
        else
            System.out.println("ob is not instance of D");

        ob = c;

        System.out.println("ob now refers to c");

        if (ob instanceof D)
            System.out.println("ob can be cast to D");
        else
            System.out.println("ob cannot be cast to D");

        if (ob instanceof A)
            System.out.println("ob is instance of A");

         /************************************
              Lambda Expression   
        ************************************/ 
         @FunctionalInterface
          interface MyFunction {
             double calculate(double x);
            }
          MyFunction f = x -> x * x;
          System.out.println(f.calculate(5));

        // ()->89.6; 
         interface Temperature {
                double getTemperature();
            }

            Temperature t = () -> 98.6;
            System.out.println(t.getTemperature());

        // n -> 1.0 / n
        interface Reciprocal {
                double calculate(double n);
            }

            Reciprocal r = n -> 1.0 / n;

            System.out.println(r.calculate(4));

        // n -> (n % 2) == 0:
        interface CheckNumber {
               boolean check(int n);
        }

        CheckNumber even = n -> (n % 2) == 0;

        System.out.println(even.check(4));
        System.out.println(even.check(7));
        

          /************************************
                      if statment   
        ************************************/ 
        // simple if 
        int x = 5 ; 
        int y = 10  ;    
        if(x < y){
            System.out.println("x is less than y");
        }

        // if else 
         if(x < y)
            {
                System.out.println("x is less than y");
            }
            else
            {
                System.out.println("x is either equals y or greater than y");
            }

        // if else if ladder 
         int month = 4; // April
        String season;

        if(month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if(month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if(month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Unknown Month";

        System.out.println("April is in the " + season + ".");

        // nested if
        int i = 10;

        if (i == 10)
        {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");

            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println("i is smaller than 12 too");
            else
                System.out.println("i is greater than 15");
        }


        
        /************************************
                      if statment   
        ************************************/ 
         int i = 9;

        switch (i)
        {
            case 0:
                System.out.println("i is zero.");
                break;

            case 1:
                System.out.println("i is one.");
                break;

            case 2:
                System.out.println("i is two.");
                break;

            default:
                System.out.println("i is greater than 2.");
        }
   
    }
}

