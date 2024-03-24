package LeetCode75;

public class Day30_ConsecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxPower("abbcccddddeeeeedcba"));
	}
	 public static  int maxPower(String s) {
		 if(s.length()==1)return 1;
	        int count=1,max=0;
	       for(int i=1;i<s.length();i++)
		        {
		            if(s.charAt(i)==s.charAt(i-1)){
		            	count++;
	                    
	                }
	                else{
	                    max=Math.max(max,count);
	                    count=1;
	                }
		        }
	            max=Math.max(max,count);
				return max;
	    }
}
