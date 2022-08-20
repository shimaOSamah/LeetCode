class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int begin = 0;

        if(s.length() == 0){
            return 0;
        }
        HashMap <Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
          char curr = s.charAt(i);

          if(freq.containsKey(curr)){
            begin = Math.max(begin, freq.get(curr) + 1);
          }
          freq.put(curr, i);
          maxLen = Math.max(maxLen, i - begin + 1);
        }
        return maxLen;
    }
}