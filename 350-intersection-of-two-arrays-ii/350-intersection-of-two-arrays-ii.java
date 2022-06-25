class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> out = new ArrayList<Integer>();
        int i =0, j= 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                out.add(nums1[i]);
                i++;
                j++;
            }
            
            else if(nums1[i] < nums2[j]){
                i++;
            }
            
            else{
                j++;
            }
            
        }
        int [] res = new int [out.size()];
        int b = 0;
        
        for(int a : out){
            res[b++] = a;
        }
        
        return res;
    }
}