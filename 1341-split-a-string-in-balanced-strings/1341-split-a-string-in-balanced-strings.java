class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int rigth = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') left++;
            else rigth++;
            if (left == rigth) res++;
        }
        return res;
    }
}