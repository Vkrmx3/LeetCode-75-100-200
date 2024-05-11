package LeetCode75;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Day78_MostFrequentEvenElement {

	public static void main(String[] args) {
		int[]nums= {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
		System.out.println(mostFrequentEven(nums));
	}
	public static int mostFrequentEven(int[] nums) {
        int result=-1,max=-1;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int ele:nums)
        {
            if(ele%2==0)
            {
                if(map.containsKey(ele))
                    map.put(ele,map.get(ele)+1);
                else
                    map.put(ele,1);
            }
        }
        for(int ele : map.keySet())
        {
            if(map.get(ele)>result)
            {
                result=map.get(ele);
                max=ele;
            }
        }
        System.out.println(map);
        return max;
    }
}
