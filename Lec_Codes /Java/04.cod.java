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




    }
}

