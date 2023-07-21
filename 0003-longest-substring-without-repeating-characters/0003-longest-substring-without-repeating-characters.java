class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int ans = 0;
        for (int  j = 0 , i = 0; i < s.length(); ++i) {
            ++count[s.charAt(i)];
            while (count[s.charAt(i)] > 1){
                --count[s.charAt(j++)];
            }
            ans = Math.max(ans , i - j + 1);
        }
        return ans;
    }
}