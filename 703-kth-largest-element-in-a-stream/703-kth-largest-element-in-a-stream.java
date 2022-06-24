class KthLargest {
    int k;
    PriorityQueue<Integer> maxPriorityQ = new PriorityQueue<Integer>();
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        for(int a : nums)
            maxPriorityQ.offer(a);
        
        while(maxPriorityQ.size() > k)
            maxPriorityQ.poll();
        
    }
    
    public int add(int val) {
        maxPriorityQ.offer(val);
        if(maxPriorityQ.size() > k)
            maxPriorityQ.poll();
        
        return maxPriorityQ.peek();
        
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */