package LeetCode75;



public class Day62_LargestPositiveIntegerThatExistsWithItsNegative {

	public static void main(String[] args) {
		int[]nums= {-9,-43,24,-23,-16,-30,-38,-30};
		System.out.println(findMaxK(nums));
	}
	public static int findMaxK(int[] nums) {
        int result=-1;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==0)
            result=Math.max(result, Math.abs(nums[i]));
        }
       }
        return result;
    }
}
