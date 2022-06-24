/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1)
            return 1;
        
        int v = n;
        
        int l = 1, h = n;
        
        while(l <= h){
            int mid = l + (h - l) / 2;
            boolean f = isBadVersion(mid);
            if(f && mid < v)
                v = mid;
            
            else if (f)
                h = mid - 1;
            
            else 
                l = mid + 1;
            
            
        }
        
        return v;
    }
}