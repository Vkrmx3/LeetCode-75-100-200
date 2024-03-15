package LeetCode75;

public class Day21_ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(arrangeCoins(21));
	}
	
public static int arrangeCoins(int n) {
     int i=1;
     while(i<n)
     {
    	 n-=i++;
     }
     if(n-i==0)
     return i;
     return i-1;
    }
public static int arrangeCoins1(int n) {
        int p=0;
        for(int i=1;p<n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		p++;
        		if(p==n)
        		{
        			if(j==i)return i;
        			return i-1;
        		}
        	}
        }
        return 0;
    }
}
