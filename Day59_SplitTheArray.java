package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class Day59_SplitTheArray {

	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(isPossibleToSplit(nums));
	}

	public static boolean isPossibleToSplit(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
			if (map.get(i) > 2)
				return false;
		}
		return true;
	}
}
