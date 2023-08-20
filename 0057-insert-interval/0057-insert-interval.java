class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newin = new int[intervals.length + 1][];

        System.arraycopy(intervals, 0, newin, 0, intervals.length);
        newin[intervals.length] = newInterval;
        intervals = newin;

        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> lists = new ArrayList<>();
        int loop = 1;

        while (loop < intervals.length) {
            int i = intervals[loop][0];
            int j = intervals[loop][1];

            if (i <= end) {

                end = Math.max(end, j);

            } else {

                lists.add(new int[]{start, end});
                start = i;
                end = j;
            }
            loop++;
        }
        lists.add(new int[]{start, end});

        return lists.toArray(new int[0][]);
    }

}