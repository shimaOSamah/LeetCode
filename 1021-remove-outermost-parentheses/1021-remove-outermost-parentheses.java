class Solution {
    public String removeOuterParentheses(String s) {
        
        String output = "";
        int count = 0;
        
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(' && count++ > 0){
                output = output + c;    
            }
            
            if(c == ')' && count-- > 1){
                output = output + c;    
            }

        }
        
        
        return output;
    }
}