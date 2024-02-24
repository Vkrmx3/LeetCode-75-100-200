package LeetCode75;

import java.util.Scanner;

public class Day1_MergeStringsAlternately {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mergeAlternately(sc.next(), sc.next()));
	}

	public static String mergeAlternately(String word1, String word2) {
		StringBuilder word3 = new StringBuilder("");
		int l1 = word1.length(), l2 = word2.length();
		for (int i = 0; i < l1 || i < l2; i++) {
			if (i < l1)
				word3.append(word1.charAt(i));
			if (i < l2)
				word3.append(word2.charAt(i));
		}
		return word3.toString();
	}
}
