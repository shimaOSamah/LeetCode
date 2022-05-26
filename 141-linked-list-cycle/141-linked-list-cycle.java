/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null)
            return false;
        
        ListNode t = head;
        t.val = Integer.MAX_VALUE;
        
        while(t.next != null){
            
            if(t.next.val == Integer.MAX_VALUE)
                return true;
            
            t.next.val = Integer.MAX_VALUE;
            t = t.next;
            
        }
        
        return false;
    }
}