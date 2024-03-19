package LeetCode75;

import java.util.Arrays;

public class Day25_FindNUniqueIntegersSumUpToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(sumZero(4)));
	}
public static int[] sumZero(int n) {
        int[]result=new int[n];
        int num=n/2;
        for(int i=n-1;i>=0;i--)
        {
        	if(n%2==0&&num==0) {
        		result[i]=--num;
        		num--;
        	}
        	else
        		result[i]=num--;	
        }
        return result;
    }
}
