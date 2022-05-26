class Solution {
    public boolean isHappy(int n) {
        
        while(true){
            if(n == 1)
                return true;
            
            n = sumOfDigit(n);
            
            if(n == 4)
                return false;
        }
    }
    
    int sumOfDigit(int n){
        int sq = 0;
        while (n > 0)
        {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }
}