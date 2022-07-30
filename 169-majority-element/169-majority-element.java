class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int count = 1;
        int maj = nums[0];
        
        for(int i = 1; i < n; i++){
            
            if(nums[i] == nums[i - 1]){
                count++;
                
                if(count > n / 2){
                    maj = nums[i];
                }
            }
            
            else{
                count = 1;
            }
        }
        
        return maj;
    }
}