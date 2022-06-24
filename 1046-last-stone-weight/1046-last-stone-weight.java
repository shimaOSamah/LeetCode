class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
        
        for(int a : stones)
            queue.add(a);
        
        while(queue.size() > 1){
            int x = queue.remove();
            int y = queue.remove();
            
            if (x != y) {
                queue.add(x- y);
            }
        }
         
         return queue.isEmpty() ? 0: queue.remove();
    }
}