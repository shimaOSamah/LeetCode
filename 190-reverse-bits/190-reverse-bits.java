public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int binaryNum = 0;
    
        for(int i=0;i<32;i++) {
            binaryNum = binaryNum<<1;                   
            binaryNum = binaryNum + (n&1);              
            n=n>>1;                                     
        }

        return binaryNum ;

    }
}   