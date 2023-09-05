class Solution {
    public static String convert(String s, int numRows) {
        String[] a = new String[numRows];
        int index = 0;
        Arrays.fill(a , "");
        if (numRows <= 1) {
            return s;
        }
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {

            if (index == 0 || index == numRows - 1) {
                flag = !flag;
            }
            if (a[index] != null) {
                a[index] += s.charAt(i);
            } else a[index] = String.valueOf(s.charAt(i));
            if (flag) {
                index++;
            }
            if (!flag) {
                index--;
            }

        }
        StringBuilder ans = new StringBuilder();
        for (String as : a) {
            ans.append(as);
        }
        return ans.toString();

    }

}