package problemSolving;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
 * valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public static void main(String[] args) {

        String s = "[[{{}]]";
        boolean isValid = isValidParentheses(s);
        System.out.print(isValid);
    }
    public static boolean isValidParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='[') {
                stack.push(']');
            } else if(c=='{') {
                stack.push('}');
            } else if(c=='['){
                stack.push(']');
            } else if(stack.isEmpty() || c!=stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
