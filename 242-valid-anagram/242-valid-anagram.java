class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder s2 = new StringBuilder(s);
        
        for(char c : t.toCharArray()){
            int i = s2.indexOf(c+"");
            
            if(i == -1)
                return false;
            
            s2.deleteCharAt(i);
        }
        
        return s2.length() == 0;
    }
}