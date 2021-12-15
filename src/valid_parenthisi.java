import java.util.Stack;

public class valid_parenthisi {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '[' || x == '{' || x == '('){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char ck;
            if (x == ')'){
                ck = stack.pop();
                if (ck == '{' || ck == '[') {
                    return false;
                }
            }else  if (x == ']'){
                ck = stack.pop();
                if (ck == '{' || ck == '(') {
                    return false;
                }
            }else  if (x == '}'){
                ck = stack.pop();
                if (ck == '(' || ck == '[') {
                    return false;
                }
            }
//            switch (x) {
//                case ')' -> {
//                    System.out.println(x);
//                    ck = stack.pop();
//                    if (ck == '{' || ck == '[') {
//                        return false;
//                    }
//                }
//                case '}' -> {
//                    ck = stack.pop();
//                    if (ck == '(' || ck == '[') {
//                        return false;
//                    }
//                }
//                case ']' -> {
//                    ck = stack.pop();
//                    if (ck == '{' || ck == '(') {
//                        return false;
//                    }
//                }
//            }


        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println( isValid("()"));
    }

}
