class Solution {
  public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            if (stack.peek() != '*') {
                while (!stack.isEmpty() && stack.peek() != '*') {
                    ans.append(stack.pop());
                }
            }
            // System.out.println(stack);
            if (!stack.isEmpty() && stack.peek() == '*') {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() == '*') {
                    stack.pop();
                    count++;
                }
                if (count > 0) {
                    int ex = 0;
                    while (!stack.isEmpty() && count > 0) {
                        char c = stack.pop();
                        if (c == '*') {
                            ex++;
                           continue;
                        }
                        count--;
                    }
                    while (ex > 0) {
                        stack.push('*');
                        ex--;
                    }
                }
            }
        }


        return  ans.reverse().toString();
    }
}