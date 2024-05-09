package LeetCode75;

public class Day76_AntOnTheBoundary {

	public static void main(String[] args) {
		int[]nums= {2,3,-5};
		System.out.println(returnToBoundaryCount(nums));
	}
	public static int returnToBoundaryCount(int[] nums) {
        int boundary=0,count=0;
        for(int ele:nums)
        {
            boundary+=ele;
            if(boundary==0)
            count++;
        }
        return count;
    }
}
