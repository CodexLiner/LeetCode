public class strStr {
    public static int strStr(String haystack, String needle , int cnt) {
        if (haystack.length() == 0 || haystack == null){
            return 0;
        }
        if (haystack.equals(needle)){
            System.out.println(cnt +" s");
            return cnt;
        }
        return strStr(haystack.substring(1) , needle , cnt + 1);
    }

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack , needle , 0));
    }
}
