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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null || val ==0)
            return head;
        
        while(head != null && head.val == val)
            head = head.next;
        
        ListNode t1 = head;
        ListNode t2 = head;
        
        while(t2 != null){
            
            if(t2.val == val){
                t1.next = t2.next;
                t2 = t2.next;
                continue;
            }
            
            t1 = t2;
            t2 = t2.next;
                
        }
        
        
        return head;
            
    }
}