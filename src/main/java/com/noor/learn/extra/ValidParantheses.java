package com.noor.learn.extra;

import java.util.Stack;

/**
 * @author noor.shaik
 * @since 03-11-2026
 */
public class ValidParantheses {

    public boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Process closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // All opening brackets must be closed
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "([]{})";
        ValidParantheses parantheses = new ValidParantheses();
        System.out.println("Is Valid parantheses::"+parantheses.solution(s));
    }
}
