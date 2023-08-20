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
    public ListNode deleteDuplicates(ListNode head) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        while (head != null) {
            map.put(head.val, map.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((entry.getValue() == 1)) {
                list.add(entry.getKey());
            }
        }
        // System.out.println(list);
        head = null;
        ListNode tail = null;
        Collections.sort(list);
        // System.out.println(list);
        for (int x : list) {
            if (head == null) {
                head = new ListNode(x);
                tail = head;
            } else {
                tail.next = new ListNode(x);
                tail = tail.next;
            }
        }
        return head;
    }
}