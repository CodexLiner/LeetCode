class Solution {
    public static String reorganizeString(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int max = 0, mChar = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                mChar = i;
            }
        }
        if (max > ((s.length() + 1) / 2)) return "";

        char[] result = new char[s.length()];
        int index = 0;
        while (freq[mChar] > 0) {
            result[index] = (char) (mChar + 'a');
            index += 2;
            freq[mChar]--;
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                if (index >= result.length) {
                    index = 1;
                }
                result[index] = (char) (i + 'a');
                index += 2;
                freq[i]--;
            }
        }
        return String.valueOf(result);

    }

}