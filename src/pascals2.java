import java.util.*;

public class pascals2 {
    public static  List<Integer> getRow(int numRows) {
        int row = numRows;
        if (numRows == 0){
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            return arrayList;
        }

        List<List<Integer>> mList = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
//        arrayList.add(1);
        queue.add(arrayList);
        mList.add(arrayList);
        while (numRows > 0 && !queue.isEmpty()){
            List<Integer> wList = queue.poll();
            List<Integer> enque = new ArrayList<>();
            enque.add(1);
            for (int i = 0; i < wList.size() - 1; i++) {
             int sum = wList.get(i) + wList.get(i+1);
              enque.add(sum);
            }
            enque.add(1);
            queue.add(enque);
            mList.add(enque);
            numRows--;

        }
        return mList.get(row);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRow(1).toArray()));
    }
}
