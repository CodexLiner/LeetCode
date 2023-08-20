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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> nodes = new ArrayList<>();

        for (ListNode list : lists) {
            ListNode node = list;
            while (node != null) {
                nodes.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(nodes);
        ListNode head = null;
        ListNode tail = null;

        for(int x : nodes){
            if (head == null){
                head = new ListNode(x);
                tail = head;
            }else {
                tail.next = new ListNode(x);
                tail = tail.next;
            }
        }
        return head;
    }
}