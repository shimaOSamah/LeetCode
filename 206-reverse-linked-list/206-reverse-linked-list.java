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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        
        ListNode temp, h2, cp;
        temp = head.next; 
        h2 = new ListNode(head.val);
        
        while(temp != null){
            cp = new ListNode(temp.val);
            cp.next = h2;
            h2 = cp;
            temp = temp.next;
        }
        
        return h2;
    }
}