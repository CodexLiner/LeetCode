class Solution {

    public List<List<String>> partition(String s) {
        ArrayList<List<String>> list = new ArrayList<>();
        partition(s, new ArrayList<>(), list);
        return list;
    }

    public static void partition(String s, List<String> temp, List<List<String>> ans) {

        if (s.length() == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(0, i + 1))) {
                temp.add(s.substring(0, i + 1));
                partition(s.substring(i + 1), temp, ans);
                temp.remove(temp.size() - 1);
            }
        }

    }
    
   public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}