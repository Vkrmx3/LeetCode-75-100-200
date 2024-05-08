package LeetCode75;

import java.util.Arrays;
import java.util.TreeMap;

public class Day75_RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]score= {5,4,3,2,1};
		System.out.println(Arrays.toString(findRelativeRanks(score)));
	}
	 public static String[] findRelativeRanks(int[] score) {
	        int n=score.length;
	        String[]result=new String[n];
	        TreeMap<Integer,Integer>map=new TreeMap<>();
	        for(int i=0;i<score.length;i++)
	            map.put(score[i],i);

	        for(int ele:map.keySet())
	        {
	            if(n>3)
	            result[map.get(ele)]=n+"";
	            else if(n==3)
	            result[map.get(ele)]="Bronze Medal";
	            else if(n==2)
	            result[map.get(ele)]="Silver Medal";
	            else if(n==1)
	            result[map.get(ele)]="Gold Medal";
	            n--;
	        }
	        return result;
	    }
}
