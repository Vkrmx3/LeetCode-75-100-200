package LeetCode75;

public class Day9_IncreasingTripletSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1, 5, 0, 4, 6 };
		System.out.println(increasingTriplet(nums));
	}

	public static boolean increasingTriplet(int[] nums) {
		if (nums == null || nums.length < 3)
			return false;

		int a = Integer.MAX_VALUE;
		int b = a;

		for (int num : nums) {
			if (num <= a)
				a = num;
			else if (num <= b)
				b = num;
			else
				return true;

		}

		return false;
	}
}
