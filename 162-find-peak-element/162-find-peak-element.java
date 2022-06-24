class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, h = nums.length - 1;
        
        while(l < h){
            int mid = (h + l) / 2;
            
            if(nums[mid] > nums[mid + 1])
                h = mid;
            
            else
                l = mid + 1;
        }
        
        return l;
    }
}