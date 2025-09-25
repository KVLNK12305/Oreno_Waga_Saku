package lc_solving;
import java.util.Stack;

public class valid_parenthesis {
    static boolean is_valid(String s){
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '{' || x=='[' || x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top_ele = stack.peek();
                if ((x == ')' && top_ele == '(') ||
                    (x == ']' && top_ele == '[') ||
                    (x == '}' && top_ele == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = ")()";
        System.out.println(is_valid(s));
    }
}
