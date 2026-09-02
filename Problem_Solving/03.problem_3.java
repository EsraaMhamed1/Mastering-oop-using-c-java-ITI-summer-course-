// Problem : Braces
/*************************************************************************************************************************
Write a method that checks whether every opening bracket { or ( has a matching closing bracket } or ) in the correct order.
Return "true" if the string is balanced, otherwise return "false".
**************************************************************************************************************************/

// Solution : 
import java.util.*;

class Parser {

    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}') {

                // Closing bracket without opening bracket
                if (stack.isEmpty()) {
                    return "false";
                }

                char top = stack.pop();

                // Check matching pair
                if (ch == ')' && top != '(') {
                    return "false";
                }

                if (ch == '}' && top != '{') {
                    return "false";
                }
            }
        }

        // If no unmatched opening brackets remain
        if (stack.isEmpty()) {
            return "true";
        }

        return "false";
    }
}
