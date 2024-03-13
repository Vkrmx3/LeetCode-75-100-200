package LeetCode75;

public class Day19_CheckIfNumberHasEqualDigitCountAndDigitValue {

	public static void main(String[] args) {
		
		System.out.println(digitCount("6210001000"));
	}
	 public static boolean digitCount(String num) {
		int[]arr=new int[num.length()];
		 long n=Long.parseLong(num);
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 arr[i]=(int) (n%10);
			 n/=10;
		 }
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j:arr)
			{
				if(i==j)count++;
			}
			result+=count;
		}
		
		return num.equals(result);
	        
	    }
}
