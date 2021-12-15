import java.util.Scanner;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
 }
public class AddNumberLeetcode {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
/*        if (l2 == null && l1 == null){
            return null;
        }
        if (l1== null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode rev1 = l1 , rev2 = l2;
//        while (l1!=null){
//            ListNode temp = new ListNode(l1.val);
//            if (rev1 == null){
//                rev1 = temp;
//            }else {
//                temp.next = rev1;
//                rev1 = temp;
//            }
//            l1 = l1.next;
//        }
//        while (l2!=null){
//            ListNode temp = new ListNode(l2.val);
//            if (rev2 == null){
//                rev2 = temp;
//            }else {
//                temp.next = rev2;
//                rev2 = temp;
//            }
//            l2 = l2.next;
//        }
        int leftNum = 0;
        ListNode node = null;
        ListNode temp = null;
        while (rev1 !=null && rev2 !=null){
            int rev1num = rev1.val;
            int rev2num = rev2.val;
            int result = rev1num + rev2num + leftNum;
            leftNum = 0;
            if (result >=10){
                leftNum = result / 10;
                int x = result % 10;
                ListNode n = new ListNode(x);
                if (node == null){
                    node = n;
                    temp = n;
                }else {
                    temp.next = n;
                    temp  = n ;
                }
            }else {
                ListNode n = new ListNode(result);
                if (node == null){
                    node = n;
                    temp = n;
                }else {
                    temp.next = n;
                    temp  = n ;
                }
            }
            rev1 = rev1.next;
            rev2 = rev2.next;
        }
       while (rev1!=null){
           int leftafter = rev1.val + leftNum;
           if (leftafter > 9){
               leftNum = leftafter / 10;
               int x = leftafter % 10;
               ListNode n = new ListNode(x);
               temp.next = n;
               temp = n;
           }else {
               ListNode n = new ListNode(leftafter);
               temp.next = n;
               temp = n;
           }
           rev1 = rev1.next;
       }
        while (rev2!=null){
            int leftafter = rev2.val + leftNum;
            if (leftafter > 9){
                leftNum = leftafter / 10;
                int x = leftafter % 10;
                ListNode n = new ListNode(x);
                temp.next = n;
                temp = n;
            }else {
                ListNode n = new ListNode(leftafter);
                temp.next = n;
                temp = n;
            }
            rev2 = rev2.next;
        }
        if (leftNum>0){
            ListNode n = new ListNode(leftNum);
            temp.next = n;
            temp = n;
        }
        return node;*/

            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;


    }
    public static void main(String[] args) throws Exception {
        ListNode node2 = Scan();
        ListNode node = Scan();
        node2 = addTwoNumbers(node , node2);

        while (node2!=null){
            System.out.print(node2.val +" ");
            node2 = node2.next;
        }
    }
    public static ListNode Scan() throws  Exception{
        ListNode head = null , tail = null;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != -1){
            i = scanner.nextInt();
            int data = i;
            if (i == -1){
                return head;
            }
            ListNode temp = new ListNode(data);
            if (head == null){
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
        }
        return head;
    }
}
