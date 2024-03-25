package LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class Day31_FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		int[]nums= {2,5,2,1,1,4,4,5,3};
		System.out.println(findDuplicates(nums));
	}
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i:nums)
        {
        	int n=Math.abs(i)-1;
        	if(nums[n]<0)list.add(n+1);
        	else
        		nums[n]=-nums[n];
        }
        return list;
    }
}
