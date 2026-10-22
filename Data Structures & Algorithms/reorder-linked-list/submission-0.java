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
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!= null) {
            fast = fast.next.next;
            slow= slow.next;
        }
        ListNode secondHalf = slow.next;
        slow.next= null;



        ListNode curr = secondHalf;
        ListNode previous = null;
        while (curr!= null) {
            ListNode next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }

        ListNode second =  previous;
        ListNode first = head;


         while (second!= null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first =firstNext;
            second = secondNext;

         }

         while (head != null) {
             System.out.print(" "+head.val);
             head = head.next;
         }



    }
}
