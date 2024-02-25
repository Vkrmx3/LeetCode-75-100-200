package LeetCode75;

import java.util.Scanner;

public class Day2_GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(gcdOfStrings(sc.next(), sc.next()));
	}

	private static String gcdOfStrings(String str1, String str2) {
		return (str1 + str2).equals(str2 + str1) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
	}

	private static int gcd(int x, int y) {

		return y == 0 ? x : gcd(y, x % y);
	}
}
