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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return mergeSorted(left, right);
    }
    
    ListNode mergeSorted(ListNode head1, ListNode head2){
        ListNode result = new ListNode(), h1 = head1, h2 = head2;
        ListNode temp = result;
        result.next = null; 
        
        while(true){
            
            if(h1 == null){
                temp.next = h2;
                break;
            }
            
            if(h2 == null){
                temp.next = h1;
                break;
            }
            
            if(h1.val <= h2.val){
                temp.next = h1;
                h1 = h1.next;
            }
            
            else{
                temp.next = h2;
                h2 = h2.next;
            }
            
            temp = temp.next;
        }
        
        return result.next;
    }
    
    ListNode getMid(ListNode head){
        ListNode h1 = null;
        
        while(head != null && head.next != null){
            h1 = h1 == null ? head : h1.next;
            head = head.next.next;
        }
        
        ListNode temp = h1.next;
        h1.next = null;
        
        return temp;
    }
}