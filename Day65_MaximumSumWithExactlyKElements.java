package LeetCode75;

public class Day65_MaximumSumWithExactlyKElements {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(maximizeSum(nums, 3));
	}

	public static int maximizeSum(int[] nums, int k) {
		int max = 0, result = 0;
		for (int ele : nums) {
			if (ele > max)
				max = ele;
		}
		for (int i = 0; i < k; i++)
			result += max++;
		return result;
	}
}
