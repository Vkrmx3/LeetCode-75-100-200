package LeetCode75;

public class Day53_FindLuckyIntegerInAnArray {

	public static void main(String[] args) {
		int[]arr= {1,2,2,3,3,3};
		System.out.println(findLucky(arr));
	}
	 public static int findLucky(int[] arr) {
	        int max = -1;
	        int[] tem = new int[501];
	        for (int i : arr)
	            tem[i]++;
	        for (int i = 1; i < tem.length; i++) {
	            if (tem[i] == i)
	                max = i;
	        }
	        return max;
	    }
}
