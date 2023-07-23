class Solution {
    public static String sortVowels(String s) {
        ArrayList<Character> characters = new ArrayList<>();
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

        int start = 0;
        int end = 1;
        return new String(chars);
    }

    private static boolean isVowel(char o) {

        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        return list.contains(o);
    }
}