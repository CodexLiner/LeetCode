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
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        int count = 0;
        ListNode len = head;
        int size = 0;
        while (len!= null){
            len = len.next;
            size++;
        }
        if (size < k){
            return head;
        }
        while (curr != null && count < k) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        head.next = reverseKGroup(curr, k);
        return prev;

    }
}