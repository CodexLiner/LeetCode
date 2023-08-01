class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combine(n, k, 1, ans, new ArrayList<>());

        return new ArrayList<>(ans);

    }

    private static void combine(int n, int k, int i, List<List<Integer>> ans, List<Integer> list) {
        if (k == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int j = i ; j <= n; j++) {
            list.add(j);
            combine(n, k - 1, j + 1, ans, list);
            list.remove(list.size() - 1);
        }
    }

}