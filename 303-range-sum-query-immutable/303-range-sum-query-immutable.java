class NumArray {
     private int[] presum;

    public NumArray(int[] nums) {
        presum = new int[nums.length+1];
        for(int i = 1;i< nums.length+1;i++){
            presum[i] = presum[i-1]+nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return presum[right+1]-presum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */