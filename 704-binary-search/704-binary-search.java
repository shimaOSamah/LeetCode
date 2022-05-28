class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums, target, nums.length-1, 0);
    }
    
    int bSearch(int[] nums, int target, int upper, int lower){
        int t = lower + ((upper - lower) / 2);
        
        if(lower > upper)
            return -1;
        
        if(nums[t] == target)
            return t;
        
        if(target < nums[t])
            upper = t - 1;
        
        else
            lower = t + 1;
        
        return bSearch(nums, target, upper, lower);
        
    }
}