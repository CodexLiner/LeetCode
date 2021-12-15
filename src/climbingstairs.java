public class climbingstairs {
    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (n == 0){
            return 0;
        }
        int all = 0;
        int two = 2;
        int one = 1;
        for (int i = 2 ; i < n ; i++) {
            all = one + two;
            one = two;
            two = all;

        }
        return all;
    }

    private static int fib(int n) {
        if (n == 0 || n == 1 || n == 2){
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
