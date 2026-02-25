package leetcode.easy.string;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false

        Example 4:
        Input: s = "([])"
        Output: true

        Example 5:
        Input: s = "([)]"
        Output: false

*/

import java.util.Stack;

public class ValidParanthese {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}{"));
    }

    public static boolean isValid(String s) {
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.empty() || stack.pop() != (Character) s.charAt(i)) {
                return false;
            }
        }
        return stack.empty();
    }
}
