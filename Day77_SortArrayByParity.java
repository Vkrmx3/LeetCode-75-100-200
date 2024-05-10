package LeetCode75;

import java.util.Arrays;

public class Day77_SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}
	public static int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        
        int l = 0;
        int r = nums.length - 1;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                arr[l++] = nums[i];
            } else {
                arr[r--] = nums[i];
            }
        }
        
        return arr;
    }
}
