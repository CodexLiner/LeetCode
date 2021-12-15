public class lengthOflast {
    public static int lengthOfLastWord(String s) {
        String [] arr  = s.split(" ");
        return arr[arr.length- 1].length();
    }

    public static void main(String[] args) {
       String s = "luffy is still joyboy";
       String [] arr  = s.split(" ");
        System.out.println(lengthOfLastWord(s));
    }
}
