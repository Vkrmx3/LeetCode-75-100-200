package LeetCode75;

public class Day57_StrongPasswordCheckerII {

	public static void main(String[] args) {
		System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
	}

	public static boolean strongPasswordCheckerII(String password) {
		if (password.length() < 8)
			return false;
		boolean lower = false, upper = false, digit = false, special = false, continuous = true;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (c >= 'a' && c <= 'z')
				lower = true;
			if (c >= 'A' && c <= 'Z')
				upper = true;
			if (c >= '0' && c <= '9')
				digit = true;
			if ("!@#$%^&*()-+".indexOf(c) != -1)
				special = true;
			if (i < password.length() - 1 && c == password.charAt(i + 1))
				continuous = false;
		}
		System.out.println(digit);
		return (lower && upper && digit && special && continuous);
	}
}
