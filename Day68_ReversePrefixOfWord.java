package LeetCode75;

public class Day68_ReversePrefixOfWord {

	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefd", 'd'));
	}

	public static String reversePrefix(String word, char ch) {
		return new String(new StringBuilder(word.substring(0, word.indexOf(ch) + 1)).reverse()
				+ word.substring(word.indexOf(ch) + 1, word.length()));
	}
}
