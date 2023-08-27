class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> elem = new ArrayList<>();
        for (int num : nums) {
            if (num>pivot){
                pos.add(num);
            }else if (num < pivot)neg.add(num);
            else elem.add(num);
        }
        elem.addAll(pos);
        neg.addAll(elem);
        int[] arr = new int[neg.size()];
        for (int i = 0; i < neg.size(); i++) {
            arr[i] = neg.get(i);
        }
        return arr;
    }
}