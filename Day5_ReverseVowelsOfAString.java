package LeetCode75;

import java.util.Scanner;

public class Day5_ReverseVowelsOfAString {

	public static void main(String[] args) {
		System.out.println(reverseVowels(new Scanner(System.in).next()));
	}

	private static String reverseVowels(String s) {
	
				char ar[] = s.toCharArray();
		int left = 0;
		int right = ar.length - 1;
		for (; left < ar.length && left < right; left++) {
			if (ar[left] == 'a' || ar[left] == 'A' || ar[left] == 'e' || ar[left] == 'E' || ar[left] == 'i'
					|| ar[left] == 'I' || ar[left] == 'o' || ar[left] == 'O' || ar[left] == 'U' || ar[left] == 'u') {
				right = RightElement(ar, left, right);
			}
		}
		return new String(ar);

	}

	private static int RightElement(char[] ar, int left, int right) {
		while (right > left) {
			if (ar[right] == 'a' || ar[right] == 'A' || ar[right] == 'e' || ar[right] == 'E' || ar[right] == 'i'
					|| ar[right] == 'I' || ar[right] == 'o' || ar[right] == 'O' || ar[right] == 'U'
					|| ar[right] == 'u') {
				char temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				return --right;
			}
			--right;
		}
		return right;
	}
}
