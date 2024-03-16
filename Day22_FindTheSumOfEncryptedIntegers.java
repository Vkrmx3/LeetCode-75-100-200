package LeetCode75;

public class Day22_FindTheSumOfEncryptedIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 21, 31 };
		
		System.out.println(sumOfEncryptedInt(nums));
//System.out.println(encrypt(150));
	}

	public static int sumOfEncryptedInt(int[] nums) {
		int result = 0;
		for (int i : nums) {
			if (i < 10)
				result += i;
			else
				result += encrypt(i);
		}
		return result;
	}

	public static int encrypt(int x) {
		int max = 0, dc = 0;

		while (x > 0) {
			max = Math.max(max, x % 10);
			dc++;
			x /= 10;
		}
		int temp = max;
		while (dc-- > 1)
			max = max * 10 + temp;

		return max;
	}
}
