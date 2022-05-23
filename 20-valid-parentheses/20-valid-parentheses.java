class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> st = new Stack <Character>();
        
        if(s.length() % 2 != 0)
            return false;
        
        for(char c : s.toCharArray()){
            
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            
            else if(c == ')' || c == ']' || c == '}'){
                
                if(st.empty())
                    return false;
                
                if(c - st.peek() <= 2 && c - st.peek() > 0){
                    st.pop();
                }
                
                else{
                    return false;
                }
            }
        }
        
        return st.empty();
        
    }
}