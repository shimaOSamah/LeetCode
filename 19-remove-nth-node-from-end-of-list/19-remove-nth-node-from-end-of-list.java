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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        
        ListNode temp = new ListNode();
        temp.next = head;
        
        ListNode s = temp;
        ListNode f = temp;
        
        for(int i = 0; i < n; i++){
            f = f.next;
        }
        
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        
        s.next = s.next.next;
        return temp.next;
    }
}