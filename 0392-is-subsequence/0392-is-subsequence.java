class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)return true;
        int start = 0;
        int i = 0;
        while (i < t.length()) {
            if (t.charAt(i) == s.charAt(start)) {
                start++;
                if (start >= s.length()) return true;
            }
            i++;
        }
        return false;
    }
}