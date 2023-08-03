class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        return letterCombinations(digits, 0, new ArrayList<>(), new StringBuilder());
    }

    public static List<String> letterCombinations(String digits, int index, List<String> ans, StringBuilder s) {
        if (index == digits.length()) {
            ans.add(s.toString());
            return ans;
        }
        int string = Integer.parseInt(String.valueOf(digits.charAt(index)));

        for (int i = 0; i < getLetters(string).length(); i++) {
            s.append(getLetters(string).charAt(i));

            letterCombinations(digits, index + 1, ans, s);
            s.deleteCharAt(s.length() - 1);
        }
        return ans;
    }

    private static String getLetters(int i) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        return map.get(i);
    }
}