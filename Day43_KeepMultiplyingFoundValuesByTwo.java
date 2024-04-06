package LeetCode75;

import java.util.Arrays;

public class Day43_KeepMultiplyingFoundValuesByTwo {

	public static void main(String[] args) {
		int[]nums= {5,3,6,1,12};
		System.out.println(findFinalValue(nums, 3));
	}
	 public static int findFinalValue(int[] nums, int original) {
	        Arrays.sort(nums);
	        for (int i : nums)
	            if (i == original)
	                original *= 2;
	        return original;
	    }
}
