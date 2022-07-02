class Solution {
    public int findDuplicate(int[] nums) {
        int [] temp = new int[nums.length + 1];
        
        for(int n : nums){
            if(temp[n] > 0)
                return n;
            temp[n] = 1;
        }
        
        return -1;
    }
}