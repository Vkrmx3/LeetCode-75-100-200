package LeetCode75;

import java.util.Arrays;

public class Day16_AppleRedistributionIntoBoxes {

	public static void main(String[] args) {
int[]apple= {5,5,5,5},capacity= {2,4,2,7};
System.out.println(minimumBoxes(apple, capacity));
	}
	 public static int minimumBoxes(int[] apple, int[] capacity) {
		 int totalApples=0;
	        for(int i:apple)
	        {
	            totalApples+=i;
	        }
	        Arrays.sort(capacity);
	        int count=0;
	        for(int i=capacity.length-1;i>=0&&totalApples>0;i--)
	        {
	        	totalApples-=capacity[i];
	        	count++;
	        	
	        }
	        return count;
	    }
}
