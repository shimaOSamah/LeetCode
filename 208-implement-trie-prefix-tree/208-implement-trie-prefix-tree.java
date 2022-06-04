class Trie {

    private HashMap <Character, Trie> children; 
    private boolean isLeaf = false;
    
    public Trie() {
        children = new HashMap <Character, Trie>();
    }
    
    public void insert(String word) {
        Trie curr = this;
        
        for(char c : word.toCharArray()){
            curr.children.putIfAbsent(c, new Trie());
            curr = curr.children.get(c);
        }
        
        curr.isLeaf = true;
        
    }
    
    public boolean search(String word) {
        Trie curr = this;
        
        for(char c : word.toCharArray()){
            
            curr = curr.children.get(c);
            
            if(curr == null)
                return false;
        }
        
        return curr.isLeaf;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        
        for(char c : prefix.toCharArray()){
            
            curr = curr.children.get(c);
            
            if(curr == null)
                return false;
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */