class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int begin = 0;
        int maxRepeted = 0;

        HashMap <Character, Integer> freq = new HashMap<>();

        for(int i = 0;i < s.length(); i++){
            char rightChar = s.charAt(i);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);

            maxRepeted = Math.max(maxRepeted, freq.get(rightChar));
            if(i - begin + 1 - maxRepeted > k){
              char leftChar = s.charAt(begin);
              freq.put(leftChar, freq.get(leftChar) - 1);
              begin++;
            }
            maxLen = Math.max(maxLen, i - begin + 1);
        }

        return maxLen;
    }
}