public class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int cnt = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                int tmp = 0;
                for (int k = i; k <= j; k++) {
                   tmp+= nums[k];
                }
                if (tmp > cnt){
                    cnt = tmp;
                }
                System.out.println();
            }

        }
        return cnt;
    }

    public static void main(String[] args) {
        int [] arr  = {-2,-1};
        System.out.println(maxSubArray(arr));
    }
}
