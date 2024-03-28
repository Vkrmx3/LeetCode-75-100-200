package LeetCode75;

import java.util.Scanner;

public class Day34_MakeThreeStringsEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(findMinimumOperations(sc.next(), sc.next(), sc.next()));
	}

	public static int findMinimumOperations(String s1, String s2, String s3) {
		int i = 0;
		for (; i < Math.min(s1.length(), Math.min(s2.length(), s3.length())); i++) {
			if (s1.charAt(i) != s2.charAt(i) | s2.charAt(i) != s3.charAt(i)) {
				break;
			}
		}
		if (i == 0)
			return -1;
		return (s1.length() - i) + (s2.length() - i) + (s3.length() - i);
	}
}
