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
    public static ListNode partition(ListNode head, int x) {

        ListNode left = null;
        ListNode left_tail = null;

        ListNode right = null;
        ListNode right_tail = null;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
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
            temp = temp.next;
        }
        if (left_tail != null) {
            left_tail.next = right;
            if(right_tail!= null){
                right_tail.next = null;
            }
            return left;
        }else return right;


    }

}