package LeetCode75;

public class Day35_PerfectNumber {

	public static void main(String[] args) {
//		System.out.println((int)Math.sqrt(7));
		System.out.println(checkPerfectNumber(6));
	}
	public static boolean checkPerfectNumber(int num) {
		int result=0,left=1, right=num/2;
		
	       while(left<right)
	       {
	        if(num%left==0)result+=left;
	        if(num%right==0)result+=right;
	        
	        left++;
	        right--;
	       }
	       
	       if(right-left==0) 
	    	   if(num%left==0)result+=left;
	      
	        return result==num;
	    }
}
