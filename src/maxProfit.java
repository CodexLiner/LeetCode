public class maxProfit {
    public static int  maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]){
                minPrice = prices[i];
            }else {
                max = Math.max(max , prices[i] - minPrice);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1} ;
        System.out.println( maxProfit(arr));
    }
}
