class Solution {
public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

        tasks.sort(Collections.reverseOrder());
        Collections.sort(processorTime);

        int max = Integer.MIN_VALUE;

        int _loop = tasks.size() / processorTime.size();
        int index = 0;

        int lo = _loop;
        int i = 0;
        while (i < tasks.size() && index < processorTime.size()) {
            int j = i;
            int inner = Integer.MIN_VALUE;
            while (j < _loop) {
                inner = Math.max(inner, processorTime.get(index) + tasks.get(j));
                j++;
            }
            index++;
            max = Math.max(inner, max);
            i = j;
            _loop += lo;
        }
        System.out.println(max);
        return max;
    }
}