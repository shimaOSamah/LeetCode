class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int begin = 0;
        int maxRepet = 0;
        
        HashMap <Character, Integer> freq = new HashMap<>();
        List <Integer> output = new ArrayList<>();
        
        for(char c : p.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i< s.length(); i++){
            char rightChar = s.charAt(i);
            
            if(freq.containsKey(rightChar)){
                freq.put(rightChar, freq.get(rightChar) - 1);
                
                if(freq.get(rightChar) == 0)
                    maxRepet++;
            }
            
            if(maxRepet == freq.size()){
                output.add(begin);
            }
            
            if(i >= p.length() -1){
                char leftChar = s.charAt(begin++);
                
                if(freq.containsKey(leftChar)){
                    if(freq.get(leftChar) == 0)
                        maxRepet--;
                    
                    freq.put(leftChar, freq.get(leftChar) + 1);
                }
            }
        }
        
        return output;
    }
}