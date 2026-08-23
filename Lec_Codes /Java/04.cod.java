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
               Ternry operators   
        ************************************/ 
         int age = 20;

        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result);

        

    }
}

