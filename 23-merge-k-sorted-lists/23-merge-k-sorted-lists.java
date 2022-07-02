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
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);

        
        for (ListNode node: lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }
      

        ListNode resultHead = null, resultTail = null;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            if (resultHead == null) {
                resultHead = resultTail = node;
            }
            else {
                resultTail.next = node;
                resultTail = resultTail.next;
            }
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }
        return resultHead;   
    }
}