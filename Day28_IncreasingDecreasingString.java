package LeetCode75;

import java.util.Iterator;
import java.util.TreeMap;

public class Day28_IncreasingDecreasingString {
	static TreeMap<Character, Integer> map = new TreeMap<>();
	static StringBuilder result = new StringBuilder();
	static int n = 0;

	public static void main(String[] args) {
		System.out.println(sortString("aaaabbbbcccc"));
	}

	public static String sortString(String s) {
		n = s.length();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		left();
		return result.toString();
	}

	static void left() {
		for (Character key : map.keySet()) {
			if (map.get(key) > 0) {
				result.append(key);
				map.put(key, map.get(key) - 1);
			}
		}
		if (result.length() < n)
			right();
	}

	static void right() {
		for (Character key : map.descendingKeySet()) {
			if (map.get(key) > 0) {
				result.append(key);
				map.put(key, map.get(key) - 1);
			}
		}
		if (result.length() < n)
			left();
	}
}
