package LeetCode75;

public class Day55_MaximumRepeatingSubstring {

	public static void main(String[] args) {
		String sequence = "bacaaaacabcaccccaacbcccccbcaaaacaabbaabbcababacca", word = "ac";
		System.out.println(maxRepeating(sequence, word));
	}

	public static int maxRepeating(String sequence, String word) {
		int max = 0, count = 0;
		for (int i = 0; i < sequence.length(); i++) {
			count = 0;

			for (int j = i; j < sequence.length() - (word.length() - 1); j++) {
				if (sequence.charAt(j) != word.charAt(0)) {
					count = 0;
				} else if (word.equals(sequence.substring(j, j + word.length()))) {
					count++;
					j += word.length() - 1;
					max = Math.max(max, count);
				} else
					count = 0;
			}
		}
		return max;
	}
}
