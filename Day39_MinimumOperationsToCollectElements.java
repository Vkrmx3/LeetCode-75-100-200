package LeetCode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day39_MinimumOperationsToCollectElements {

	public static void main(String[] args) {
		List<Integer>nums=new ArrayList<>();
//		nums.add(3);
//		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		
		System.out.println(minOperations(nums, 3));
	}
	
	public static int minOperations(List<Integer> nums, int k) {
		int count =0,i=nums.size()-1;
		Set<Integer>set=new HashSet<>();
        for(;i>=0;i--)
        {
        	if(!(set.contains(nums.get(i)))&&nums.get(i)<=k) {
        		set.add(nums.get(i));
        		count++;
        	}
        	if(count==k)break;
        }
        return nums.size()-i;
    }
}
