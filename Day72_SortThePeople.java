package LeetCode75;

import java.util.Arrays;

public class Day72_SortThePeople {

	public static void main(String[] args) {
		String[]names= {"Mary","John","Emma"};
		int[]heights= {180,165,170};
		System.out.println(Arrays.toString(sortPeople(names, heights)));
	}
	 public static String[] sortPeople(String[] names, int[] heights) {
		 for(int i=0;i<heights.length;i++)
			{
				int end=heights.length-i-1;
				swap(max(end, heights),end,heights,names);

			}
			return names;
	    }
	 public static int max( int end, int[]heights)
		{
			int max=0;
			for(int i=0; i<=end; i++)
			{
				if(heights[i]<heights[max])
				{
					max=i;
				}
			}
			return max;
		}
		public static void swap(int max, int end, int[]heights,String[]names)
		{
			String tem=names[max];
			names[max]=names[end];
			names[end]=tem;
			int temp=heights[max];
			heights[max]=heights[end];
			heights[end]=temp;
		}
}
