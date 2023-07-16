class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis(n, n, ans, new StringBuilder());
        return ans;
    }
        public static void generateParenthesis(int start, int end, List<String> ans, StringBuilder parenthesis) {
        if (start == 0 && end == 0) {
            ans.add(parenthesis.toString());
            return;
        }
        if (start > 0) {
            parenthesis.append('(');
            generateParenthesis(start - 1, end, ans, parenthesis);
            parenthesis.deleteCharAt(parenthesis.length() - 1);
        }
        if (end > 0 && end > start){
            parenthesis.append(')');
            generateParenthesis(start, end - 1, ans, parenthesis);
            parenthesis.deleteCharAt(parenthesis.length() - 1);
        }

    }
}