public class mergeSortedLL {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode head = null;
        ListNode tail = null;
        while (list1!=null && list2 !=null){
            if (head == null){
              if (list1.val < list2.val){
                  ListNode t = new ListNode(list1.val);
                  head = t;
                  tail = t;
                  list1 = list1.next;
              }else {
                  ListNode t = new ListNode(list2.val);
                  head = t;
                  tail = t;
                  list2 = list2.next;
              }

            }else if (list1.val < list2.val){
                ListNode n = new ListNode(list1.val);
                tail.next = n;
                tail = n;
                list1 = list1.next;
            }else {
                ListNode n = new ListNode(list2.val);
                tail.next = n;
                tail = n;
                list2 = list2.next;
            }
        }
        while (list1!=null){
            ListNode l = new ListNode(list1.val);
            tail.next = l;
            tail = l;
            list1 = list1.next;
        }
        while (list2!=null){
            ListNode l = new ListNode(list2.val);
            tail.next = l;
            tail = l;
            list2 = list2.next;
        }
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) throws Exception {
        ListNode list1 = Scan.Scan();
        ListNode list2 = Scan.Scan();
        mergeTwoLists(list1 , list2);
    }
}
