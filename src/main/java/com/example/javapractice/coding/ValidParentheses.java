package com.example.javapractice.coding;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        boolean flag = isValid(exp);
        System.out.println(flag);
    }

    private static boolean isValid2(String str) {

        if(str.contains("()")){
            return false;
        }


        return false;
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                // Check if brackets match
                if ((ch == '}' && top != '{') ||
                        (ch == ')' && top != '(') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
