class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        list.add(1);
        queue.add(list);
        while (!queue.isEmpty() && rowIndex >= 0) {
            list = queue.poll();
            ArrayList<Integer> nl = new ArrayList<>();
            nl.add(1);
            for (int i = 1; i < list.size(); i++) {
               nl.add(list.get(i)+list.get(i - 1));
            }
            nl.add(1);
            queue.add(nl);

            rowIndex--;
        }
        return list;        
    }
}   