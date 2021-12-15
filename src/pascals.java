import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pascals {
    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0){
            List<List<Integer>> mList = new ArrayList<>();
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            mList.add(arrayList);
            return mList;
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
            for (int i = 0; i < enque.size(); i++) {
                System.out.print(enque.get(i)+" ");
            }
            queue.add(enque);
            mList.add(enque);
            numRows--;

        }
        return mList;
    }

    public static void main(String[] args) {
        generate(1);
    }
}
