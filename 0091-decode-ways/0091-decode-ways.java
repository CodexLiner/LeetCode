class Solution {
    public static int numDecodings(String s) {
        int arr[]  = new int[s.length()+1];
        Arrays.fill(arr , -1);
        return numDecodings(s , 0 , arr);
    }

    public static int numDecodings(String s, int index , int[] dp) {
        if (index == s.length()) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        if (dp[index] != -1)return dp[index];
        int count = numDecodings(s, index + 1 , dp);
        if ( index < s.length() - 1 && (s.charAt(index) == '1' || s.charAt(index) == '2' && s.charAt(index + 1) < '7')) {
            count += numDecodings(s, index + 2 , dp);
        }
        dp[index] = count;
        return count;

    }
}