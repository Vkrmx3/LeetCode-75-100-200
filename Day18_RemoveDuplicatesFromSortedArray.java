package LeetCode75;

import java.util.Arrays;

public class Day18_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[left] != nums[right])
                nums[++left] = nums[right++];

            else
                right++;
        }
        return ++left;
    }
}
