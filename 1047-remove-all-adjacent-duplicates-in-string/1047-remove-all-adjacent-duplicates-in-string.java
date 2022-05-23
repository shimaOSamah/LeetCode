class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack <Character>();
        
        String output = "";
        
        for(int i = 0; i< s.length(); i++){
            
            if(!st.empty() && (st.peek() == s.charAt(i))){
                st.pop();
                continue;
            }
               
            else
                st.push(s.charAt(i));
        }
        
        while(!st.empty())
            output = st.pop() + output;
        
        return output;
    }
}