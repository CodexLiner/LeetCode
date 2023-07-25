class Solution {
    public int minSwaps(String s) {
        if (s.length() == 0) return -1;
        int one = 0;
        int zero = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') one++;
            else zero++;
        }
        if (Math.abs(one - zero) > 1) {
            return -1;
        }
        if (one > zero) {
            return count(s, '1');
        } else if (one < zero) {
            return count(s, '0');
        }
        return Math.min(count(s, '1'), count(s, '0'));

    }

    private int count(String s, char c) {
        int x = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2) {
            if (ch[i] != c) x++;
        }
        return x;
    }
}