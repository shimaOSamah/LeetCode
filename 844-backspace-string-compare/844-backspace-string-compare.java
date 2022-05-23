class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> s1 = new Stack<Character>();
        Stack <Character> s2 = new Stack<Character>();
        
        String o1 = "", o2 = "";

        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#' && !s1.empty())
                 s1.pop();
            
            else if(c != '#')
                s1.push(c);
        }
        
        
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(c == '#' && !s2.empty())
                 s2.pop();
            
            else if(c != '#')
                s2.push(c);
        }
        
        if(s1.size() != s2.size())
            return false;
        
        while(!s1.empty())
            o1+=s1.pop();
            
        while(!s2.empty())
            o2+=s2.pop();
        
        if(o1.equals(o2))
            return true;
        
        return false;
        
    }
}