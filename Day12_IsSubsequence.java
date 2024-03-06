package LeetCode75;

import java.util.Scanner;

public class Day12_IsSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isSubsequence(sc.next(), sc.next()));
	}

	public static boolean isSubsequence(String s, String t) {
        int pos = 0;
        if (s.length() == 0)
            return true;
        else if (t.length() > 0)

            for (int i = 0; i < t.length() && pos < s.length(); i++) {
                if (t.charAt(i) == s.charAt(pos)) {
                    pos++;
                }
            }

        if (pos == s.length())
            return true;
        else
            return false;
    }
}
