class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] count = new int[1001];
        
        for(int n : arr1)
            count[n]++;
        
        int index =0;
        
        for(int arr : arr2)
        {
            int numberOfElement = count[arr]; 
            
            while(numberOfElement-- != 0)
                arr1[index++]=arr;
            
            count[arr] = 0;
        }
        
        for(int number = 0; number < 1001; number++)
        {
            int numberOfElement = count[number];
            
             while(numberOfElement-- != 0)
                arr1[index++] = number;
        }
        
        return arr1;
    }
}