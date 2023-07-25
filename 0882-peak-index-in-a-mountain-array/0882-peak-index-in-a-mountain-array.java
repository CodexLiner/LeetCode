class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int num = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num){
                num = arr[i];
                index = i;
            }
        }
        return index;
    }
}