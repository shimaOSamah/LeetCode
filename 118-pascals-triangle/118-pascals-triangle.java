class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i =0; i < numRows; i++){
            List <Integer> temp = new ArrayList <Integer> ();
            
            for(int l = 0; l <= i; l++){
                if(l == 0 || l == i){
                    temp.add(l,1);
                }
                
                else{
                    int v = res.get(i - 1).get(l) + res.get(i - 1).get(l-1);
                    temp.add(l,v);
                }
            }
            
            res.add(i, temp);
        }
        
        return res;
    }
}