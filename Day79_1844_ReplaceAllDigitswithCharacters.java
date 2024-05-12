package LeetCode75;

public class Day79_1844_ReplaceAllDigitswithCharacters {

	public static void main(String[] args) {
		System.out.println(replaceDigits("a1c1e1"));
	}
	public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length(); i += 2)
            if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9')
                sb.replace(i, i + 1, (char) (s.charAt(i - 1) + s.charAt(i) - 48) + "");

        return sb.toString();
    }
}
