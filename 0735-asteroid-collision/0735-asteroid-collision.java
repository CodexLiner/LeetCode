class Solution {
    public static int[] asteroidCollision(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : a) {
            list.add(j);
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < 0 && list.get(i - 1) > 0 && Math.abs(list.get(i)) < Math.abs(list.get(i - 1))) {
                list.remove(i);
                i = i - 1;
            } else if (list.get(i) < 0 && list.get(i - 1) > 0 && Math.abs(list.get(i)) > Math.abs(list.get(i - 1))) {
                list.remove(i - 1);
                i = 0;
            } else if (list.get(i) < 0 && list.get(i - 1) > 0 && Math.abs(list.get(i)) == Math.abs(list.get(i - 1))) {
                list.remove(i - 1);
                list.remove(i - 1);
                i = 0;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


}