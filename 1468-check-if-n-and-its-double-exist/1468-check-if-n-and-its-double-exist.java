class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> m = new HashSet<>();
        for (int a : arr) {if (m.contains(a * 2) || a % 2 == 0 && m.contains(a / 2)) return true; m.add(a);}return false;

    }
}