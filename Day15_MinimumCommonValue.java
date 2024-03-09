package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day15_MinimumCommonValue {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4 };
		System.out.println(getCommon(nums1, nums2));

	}
	
	public static int getCommon(int[] nums1, int[] nums2) {
		 int left = 0, right = 0;

	        if (nums1[nums1.length - 1] < nums2[0] || nums2[nums2.length - 1] < nums1[0])
	            return -1;

	        while (left < nums1.length && right < nums2.length) {
	            int n1 = nums1[left], n2 = nums2[right];
	            if (n1 == n2)
	                return n1;
	            else if (n2 > n1)
	                left++;
	            else
	                right++;

	        }
	        return -1;
	}
	
	
	

//	public static int getCommon(int[] nums1, int[] nums2) {
//		Set<Integer> list = new HashSet<>();
//
//		for (int i : nums1) {
//			list.add(i);
//		}
//
//		for (int i : nums2) {
//			if (list.contains(i))
//				return i;
//		}
//
//		return -1;
//	}
}
