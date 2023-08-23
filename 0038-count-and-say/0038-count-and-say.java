class Solution {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = countAndSay(s);
        }
        return s;
    }

    public static String countAndSay(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        char f = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == f) {
                count++;
            } else {
                stringBuilder.append(count).append(f);
                f = s.charAt(i);
                count = 1;
            }
        }
        stringBuilder.append(count).append(f);
        return stringBuilder.toString();
    }
}