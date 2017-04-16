package cn.zhoubin.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Administrator on 2017/2/25.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        HashMap<Character, Character> mapping = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (!mapping.containsKey(c))
                stack.add(c);
            else {
                if (stack.size() == 0 || stack.peek() != mapping.get(c))
                    return false;
                else if (stack.size() != 0 && stack.peek() == mapping.get(c)) {
                    stack.pop();
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
//        String s = ""; //true
//        String s = "(){}[]"; // true;
        String s = "([)]"; //false
        boolean result = new ValidParentheses().isValid(s);
        System.out.println(result);

    }
}
