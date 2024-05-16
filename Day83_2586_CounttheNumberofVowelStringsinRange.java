package LeetCode75;

public class Day83_2586_CounttheNumberofVowelStringsinRange {

	public static void main(String[] args) {
		String[]words= {"hey","aeo","mu","ooo","artro"};
		System.out.println(vowelStrings(words, 1, 4));
	}
	 public static int vowelStrings(String[] words, int left, int right) {
	        int count = 0;
	        String vowel = "aeiou";
	        for (; left <= right; left++) {
	            if (vowel.indexOf(words[left].charAt(0)) > -1
	                    && vowel.indexOf(words[left].charAt(words[left].length() - 1)) > -1)
	                count++;
	        }
	        return count;
	    }
}
