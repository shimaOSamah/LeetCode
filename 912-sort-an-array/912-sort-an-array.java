class Solution {
    public int[] sortArray(int[] nums) {
         mergeSort(nums);
        return nums;
    }
    
    void mergeSort(int [] array){
        if(array.length < 2)
            return;
        
        int mid = array.length / 2;
        
        int [] l = Arrays.copyOfRange(array, 0, mid);
        int [] r = Arrays.copyOfRange(array, mid, array.length);
        
        mergeSort(l);
        mergeSort(r);
        merge(array, l , r);
    }
    
    void merge(int [] array, int [] left, int [] right){
        int a = 0, b = 0, i = 0;
        
        while(a < left.length && b < right.length){
            
            if(left[a] <= right[b]){
                array[i++] = left[a++];
            }
            
            else{
                array[i++] = right[b++];
            }
        }
        
        while(a < left.length)
            array[i++] = left[a++];
        
        while(b < right.length)
            array[i++] = right[b++];
    }
}