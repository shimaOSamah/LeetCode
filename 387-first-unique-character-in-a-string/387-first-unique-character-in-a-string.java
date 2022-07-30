class Solution {
    public int firstUniqChar(String s) {
        int [] set = new int [26];
        int res = -1;
        int indx = 0;
        
        for(char c : s.toCharArray()){
            set[c - 97]++;
        }
        
        for(char c : s.toCharArray()){
            if(set[c - 97] == 1){
                return indx;
            }
            indx++;
        }
        
        return -1;
    }
}