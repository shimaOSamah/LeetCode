class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start;
        int end = s.length() -1;

        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');


        for(start=0; start<s.length(); start++){

            if(start >= end)
                break;

            if(vowel.contains(s.charAt(start))){

                while (end>=0){
                    if(vowel.contains(arr[end])){

                        Character temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        end --;
                        break;
                    }
                    end --;
                }
            }

        }

        return String.copyValueOf(arr);
    }
}