// problem 1 : 
/**************************************************************************************************
Create an Arithmetic class with a sum method that calculates the sum of an Integer[] array. 
Overload the sum method to accept a String[] array and concatenate all the string elements in order.
****************************************************************************************************/

// Solution : 

import java.io.*;
import java.util.*;

class Arithmetic {

    public Integer sum(Integer[] ints) {
        int total = 0;
        for (Integer num : ints) {
            total += num;
        }
        return total;
    }

    public String sum(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        String input = sc.nextLine().trim();
        if (input.isEmpty()) {
            sc.close();
            return;
        }

        String[] parts = input.split("\\s+");
        Arithmetic arithmetic = new Arithmetic();

        boolean isNumeric = true;
        try {
            Integer.parseInt(parts[0]);
        } catch (NumberFormatException e) {
            isNumeric = false;
        }

        if (isNumeric) {
            Integer[] ints = new Integer[parts.length];
            for (int i = 0; i < parts.length; i++) {
                ints[i] = Integer.parseInt(parts[i]);
            }
            System.out.println(arithmetic.sum(ints));
        } else {
            System.out.println(arithmetic.sum(parts));
        }

        sc.close();
    }
}
