class Solution {
    public static String sortVowels(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> vw = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])){
                vw.add(chars[i]);
            }
        }
        Collections.sort(vw);
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])){
                chars[i] = vw.get(x++);
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char a) {
         return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }
}