class Solution {
    public static int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                chars[c - 'a']++;
            }
        }
        int count = 0;
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        int i = 0;
        int j = 1;
        do {
            if (chars[i] != 0 && chars[j] != 0 && chars[i] == chars[j]) {
                chars[j]--;
                count++;
                Arrays.sort(chars);
                i = 0;
                j = 1;
            } else {
                i++;
                j++;
            }
        } while (i != 26 && j != 26);


        return count;
    }

}