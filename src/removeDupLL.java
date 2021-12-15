public class removeDupLL {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode temp = head;
        while (temp.next != null){
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
//
        }
        return head;

    }

    public static void main(String[] args) throws Exception {
        ListNode head = Scan.Scan();
        head = deleteDuplicates(head);
        while (head!=null){
            System.out.print(" "+head.val);
            head = head.next;

        }
    }
}
