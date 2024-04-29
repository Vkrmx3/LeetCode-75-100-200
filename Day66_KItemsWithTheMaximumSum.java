package LeetCode75;

public class Day66_KItemsWithTheMaximumSum {

	public static void main(String[] args) {
		System.out.println(kItemsWithMaximumSum(6, 6, 6, 13));
	}
	public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k)
            return k;
        k -= numZeros;
        k -= numOnes;
        if (k < 0)
            return numOnes;
        return numOnes - k;
    }
}
