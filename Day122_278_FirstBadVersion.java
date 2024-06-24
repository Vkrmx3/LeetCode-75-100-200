/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=n%2==0?0:1, end=n, result=Integer.MAX_VALUE;
        while(start<end)
        {
            n=start+(end-start)/2;

            if(isBadVersion(n))
                end=n;            
            else
                start=n+1;
 
        //    if(start==n )
        //          break;
        }
        return start;
    }
}
