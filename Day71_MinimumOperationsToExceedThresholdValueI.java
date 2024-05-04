package LeetCode75;

public class Day71_MinimumOperationsToExceedThresholdValueI {

	public static void main(String[] args) {
		int []nums= {2,11,10,1,3};
		System.out.println(minOperations(nums, 10));
	}
	public static int minOperations(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]<k)
                count++;
        return count;
    }
}
