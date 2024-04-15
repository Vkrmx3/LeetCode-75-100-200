package LeetCode75;

public class Day52_CountOfMatchesInTournament {

	public static void main(String[] args) {
		System.out.println(numberOfMatches(7));
	}
	public  static int numberOfMatches(int n) {
        int result = 0;
        while (n > 1) 
        {
            int team = n / 2;
            n = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
            result += team;
        }
        return result;
    }
}
