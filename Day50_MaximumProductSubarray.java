package LeetCode75;

public class Day50_MaximumProductSubarray {

	public static void main(String[] args) {
		int[]nums= {2,3,-2,4};
		System.out.println(maxProduct(nums));
	}
	public static int maxProduct(int[] nums) {
        int preffix = 1, suffix = 1, result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (preffix == 0)
                preffix = 1;
            if (suffix == 0)
                suffix = 1;
            preffix *= nums[i];
            suffix *= nums[nums.length - i - 1];
            result = Math.max(result, Math.max(preffix, suffix));
        }
        return result;
    }
}
