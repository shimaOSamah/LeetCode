class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int n = nums[0];
        
        for(int a : nums){
            maxHeap.add(a);
        }
        
        for(int i =0; i< k; i++){
            n = maxHeap.poll();
        }
        
        return n;
        
    }
}