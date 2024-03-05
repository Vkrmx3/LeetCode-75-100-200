package LeetCode75;

import java.util.Arrays;

public class Day11_MoveZeroes {

	public static void main(String[] args) {
		int[]nums= {0,0,2,1,1};
		moveZeroes(nums);
	}
	 public static void moveZeroes(int[] nums) {
	        int left=0;
	       for(int right=0;right<nums.length;right++)
        {
            if(nums[right]!=0)
            {
                int temp=nums[left];
              nums[left++]=nums[right];
              nums[right]=temp;
            }
        }
	        System.out.println(Arrays.toString(nums));
	 }
}
