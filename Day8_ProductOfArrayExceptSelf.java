package LeetCode75;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	 public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int pre[] = new int[n];
	        int suff[] = new int[n];
	        pre[0] = 1;
	        suff[n - 1] = 1;
	        
	        for(int i = 1; i < n; i++) {
	            pre[i] = pre[i - 1] * nums[i - 1];
	        }
	        for(int i = n - 2; i >= 0; i--) {
	            suff[i] = suff[i + 1] * nums[i + 1];
	        }
	        
	        int ans[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            ans[i] = pre[i] * suff[i];
	        }
	        return ans;
	    }
	
	// way 2
	 //it will not work if the array consists any 0 
	 
//	 public static int[] productExceptSelf(int[] nums) {
//		 int []result=new int[nums.length];
//		 int product=Product(nums);
//	        for(int i=0;i<nums.length;i++)
//	        {
//	        	result[i]=divide(product,nums[i]);
//	        }
//	        return result;
//	    }
//	    private static int Product(int[]nums)
//	    {
//	    	int product=1;
//	        for(int i:nums)
//	        {
//	        	if(i!=0)product*=Math.abs(i);
//	        }
//	        return product;
//	    }
//	    private static int divide(int divident,int divisor)
//	    {
//	    	int quotient=1;
//	    	while(divident>divisor&&divisor>0)
//	    	{
//	    		divident-=divisor;
//	    		quotient++;
//	    	}
//	    	return quotient;
//	    }
}
