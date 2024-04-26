package LeetCode75;

import java.util.Arrays;

public class Day63_RunningSumOf1dArray {

	public static void main(String[] args) {
		int[]nums= {1,2,3,4,5};
		System.out.println(Arrays.toString(runningSum(nums)));
	}
	public static int[] runningSum(int[] nums) {
        int[]runningSums=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            runningSums[i]=sum;
        }
        return runningSums;
    }
}
