class Solution {
    public String reverseWords(String s) {
        String [] a = s.split(" ");
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            StringBuilder ins = new StringBuilder(a[i]);
            ins.reverse();
            ss.append(ins).append(' ');
        }
        System.out.println(ss.toString().trim());   
        return ss.toString().trim();
    }
}