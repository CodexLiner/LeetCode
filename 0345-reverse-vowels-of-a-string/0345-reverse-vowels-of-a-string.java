class Solution {
    public static String reverseVowels(String s) {
        List<Character> li = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])){
                li.add(chars[i]);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i]) && li.size() > 0 ) {
                chars[i] = li.remove(li.size() - 1);
            }
        }
        return new String(chars);
    }
    private static boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }
}