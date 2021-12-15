public class valid_parenthisis {
    public static boolean isValid(String str) {
        String ss = str;
        if (ss.length() == 1){
            return false;
        }else {
            return isValid2(ss);
        }
    }

    private static boolean isValid2(String s) {
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        if (s.charAt(0) == '{' && s.charAt(1)=='}'){
            return isValid2(s.substring(2));
        }
        if (s.charAt(0) == '[' && s.charAt(1)==']'){
            return isValid2(s.substring(2));
        }
        if (s.charAt(0) == '(' && s.charAt(1)==')'){
            return isValid2(s.substring(2));
        }
        if (s.charAt(0) == '(' && s.charAt(s.length() -1)== ')'){
            return isValid2(s.substring(1 , s.length() - 2));
        }
        if (s.charAt(0) == '[' && s.charAt(s.length() -1)== ']'){
            return isValid2(s.substring(1 , s.length() - 2));
        }
        if (s.charAt(0) == '{' && s.charAt(s.length() -1)== '}'){
            return isValid2(s.substring(1 , s.length() - 2));
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "{[]}";
      //  System.out.println(s.length());
        System.out.println(isValid("({{{{}}}))"));
    }
}
