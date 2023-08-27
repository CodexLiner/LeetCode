class Solution {
    public static int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        for (int i = 0; i < Math.max(str2.length , str1.length); i++) {
            int x = i>=str1.length ? 0 : Integer.parseInt(str1[i]);
            int y = i>=str2.length ? 0 : Integer.parseInt(str2[i]);
            if (x>y)return 1;
            if (x<y)return -1;
            
        }
        return 0;
    }

}