class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int begin = 0;
        int matched = 0;
        
        HashMap <Character, Integer> freq = new HashMap<>();
        
        for(char c : s1.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < s2.length(); i++){
            char rightChar = s2.charAt(i);
            
            if(freq.containsKey(rightChar)){
                
                freq.put(rightChar, freq.get(rightChar) - 1);
                if(freq.get(rightChar) == 0)
                    matched++;
            }
            
            if(matched == freq.size())
                return true;
            
            if(i >= s1.length() - 1){
                char leftChar = s2.charAt(begin++);
                
                if(freq.containsKey(leftChar)){
                    if(freq.get(leftChar) == 0)
                        matched--;
                    
                    freq.put(leftChar, freq.get(leftChar) + 1);
                }
            }
            
        }
        
        
        return false;
    }
}