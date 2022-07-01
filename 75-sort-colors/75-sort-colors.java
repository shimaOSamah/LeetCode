class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int green=0;
        
        for(int val : nums){
            switch(val){
            case 0-> red++;
            case 1-> white++;
            case 2-> green++;
        }
        }
        int i=0;
        while(red-->0)
            nums[i++]=0; 
        
        while(white-->0)
            nums[i++]=1;
          
        while(green-->0)
            nums[i++]=2;
    }
}