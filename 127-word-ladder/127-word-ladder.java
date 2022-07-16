class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set <String> set = new HashSet<>(wordList);
        Queue <String> queue = new LinkedList<>();
        queue.add(beginWord);
        int sum = 1;
        
        while(!queue.isEmpty()){
            for(int i = queue.size(); i > 0; i--){
                String cur = queue.poll();
                
                if(cur.equals(endWord))
                    return sum;
                
                for(int j = 0; j < cur.length(); j++){
                    StringBuilder temp = new StringBuilder(cur);
                    
                    for(int k = 0; k < 26; k++){
                        
                         if((char)('a' + k) != temp.charAt(j)) 
                             temp.setCharAt(j, (char)('a' + k));
                        
                        if(set.contains(temp.toString())) {
                            queue.add(temp.toString());
                            set.remove(temp.toString());
                        }
                            
                    }
                }
            }
            sum++;
        }
        
        
        return 0;
    }
}