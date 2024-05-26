package LeetCode75;

public class Day93_1854_MaximumPopulationYear {

	public static void main(String[] args) {
		int[][]logs= {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
		System.out.println(maximumPopulation(logs));
	}
		public static int maximumPopulation(int[][] logs) {
	        int[] year = new int[2051];
	        for (int[] log : logs) {

	            year[log[0]] += 1;
	            year[log[1]] -= 1;
	        }

	        int maxNum = year[1950], maxYear = 1950;
	        for (int i = 1951; i < year.length; i++) {
	            year[i] += year[i - 1];
	            if (year[i] > maxNum) {
	                maxNum = year[i];
	                maxYear = i;
	            }
	        }
	        return maxYear;
	    }
}
