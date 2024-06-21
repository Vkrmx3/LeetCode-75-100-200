
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=n%2==0?0:1, end=n;
        while(n>0)
        {
        	int pick=guess(n);
        	if(pick==0)
        		return n;
        	else if(pick==-1)
        		{
                    end=n;
        			n=start+(end-start)/2;	
        		}
        	else
        	{
        		start=n;
        		n=start+(end-start)/2;
        	}
        	System.out.println(n);
        }
        return -1;
    }
}
