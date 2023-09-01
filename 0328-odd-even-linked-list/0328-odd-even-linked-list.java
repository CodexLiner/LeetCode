/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
  ListNode left = null;
        ListNode left_tail = null;

        ListNode right = null;
        ListNode right_tail = null;

        ListNode temp = head;
        int i = 1;
        while (temp != null) {
            if (i % 2 !=0) {
                if (left == null) {
                    left = temp;
                    left_tail = temp;
                } else {
                    left_tail.next = temp;
                    left_tail = left_tail.next;
                }
            } else {
                if (right == null) {
                    right = temp;
                    right_tail = temp;
                } else {
                    right_tail.next = temp;
                    right_tail = temp;
                }
            }
            i++;
            temp = temp.next;
        }
        if (right_tail != null) {
            right_tail.next = null;
        }
        if (left_tail != null) {
            left_tail.next = right;

            return left;
        } else return right;
   
    }
}