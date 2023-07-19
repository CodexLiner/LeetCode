class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int p = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[p][1]){
                count++;
                p = i;
            }
        }
        return intervals.length - count ;
    }
}