package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class Day64_DivideArrayIntoEqualPairs {

	public static void main(String[] args) {
		int[]nums= {3,2,3,2,2,2};
		System.out.println(divideArray(nums));
	}
	public static boolean divideArray(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else
                map.put(ele,1);
        }
        for(int ele:map.keySet())
        {
            if(map.get(ele)%2!=0)
                return false;
        }
        return true;
    }
}
