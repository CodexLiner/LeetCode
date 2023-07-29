class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() == 0) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == 'B' && sb.charAt(sb.length() - 1) == 'A' || s.charAt(i) == 'D' && sb.charAt(sb.length() - 1) == 'C') {
                sb.deleteCharAt(sb.length() - 1);
            } else sb.append(s.charAt(i));
        }
        return sb.length();       
    }
}