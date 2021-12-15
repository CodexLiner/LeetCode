public class cycleLL {
    public static boolean hasCycle(ListNode head) {
        ListNode node = head;
        ListNode tail = head.next;
        while (tail!= null && node != null){
           if (node == tail){
               return true;
           }
           tail = tail.next.next;
           node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
         ListNode node = new ListNode(1);
         ListNode list = new ListNode(2);
         node.next = list;
         list.next = node;

        System.out.println( hasCycle(new ListNode(1)));
    }
}
