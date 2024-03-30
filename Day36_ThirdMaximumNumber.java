package LeetCode75;

public class Day36_ThirdMaximumNumber {

	public static void main(String[] args) {
		int[]nums= {1,-2147483648,2};
		System.out.println(thirdMax(nums));
	}
	public static int thirdMax(int[] nums) {
		int fmax=nums[0];
        long smax=Long.MIN_VALUE, tmax=smax;
        
        for(int i:nums)
        {
        	if(i>fmax) {
                tmax=smax;
        		smax=fmax;
        		fmax=i;
        	}
        	else if(i<fmax & i>smax) {
        		tmax=smax;
        		smax=i;
        	}
        	else if(i<smax & i>tmax)tmax=i;
        }
        if(tmax==Long.MIN_VALUE)return fmax;
        return (int)tmax;
    }
}
