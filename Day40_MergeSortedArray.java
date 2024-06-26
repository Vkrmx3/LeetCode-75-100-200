package LeetCode75;

import java.util.Arrays;

public class Day40_MergeSortedArray {

	public static void main(String[] args) {
		int[]nums1= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			nums2= {-50,-50,-48,-47,-44,-44,-37,-35,-35,-32,-32,-31,-29,-29,-28,-26,-24,-23,-23,-21,-20,-19,-17,-15,-14,-12,-12,-11,-10,-9,-8,-5,-2,-2,1,1,3,4,4,7,7,7,9,10,11,12,14,16,17,18,21,21,24,31,33,34,35,36,41,41,46,48,48};
		merge(nums1, 0, nums2, 63);
		System.out.println(Arrays.toString(nums1));
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer=m--+--n;
        while(n>=0)
        	if(m<0 || nums1[m]<=nums2[n])nums1[pointer--]=nums2[n--];
        	else nums1[pointer--]=nums1[m--];
    }
}
