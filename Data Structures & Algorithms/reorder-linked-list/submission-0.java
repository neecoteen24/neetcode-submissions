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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; //reaching the middle of the list
        }
        ListNode first = head;
        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode sec = prev;

        ListNode temp1 = first;
        ListNode temp2 = sec;

        while(sec != null){
            temp1 = first.next;
            temp2 = sec.next;

            first.next = sec;
            sec.next = temp1;

            first = temp1;
            sec = temp2;
        }

    }
}
