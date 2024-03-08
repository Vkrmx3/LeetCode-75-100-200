package LeetCode75;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day14_CountElementsWithMaximumFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[sc.nextInt()];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(maxFrequencyElements(nums));
	}

	public static int maxFrequencyElements(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		int max = Collections.max(map.values()), result = 0;

		for (int i : map.values()) {
			if (max == i)
				result += i;
		}
		return result;

	}
}
