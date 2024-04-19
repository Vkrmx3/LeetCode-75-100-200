package LeetCode75;

import java.util.Scanner;

public class Day42_MakeTheStringGreat {

	public static void main(String[] args) {
		System.out.print(makeGood("abBAcC"));
	}

	public static String makeGood(String s) {

		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length() - 1; i++) {

			if (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32) {
				// sb.replace(i, i+2,"");
				sb.delete(i, i + 2);
				i = -1;
			}
		}
		return sb.toString();
	}
}
