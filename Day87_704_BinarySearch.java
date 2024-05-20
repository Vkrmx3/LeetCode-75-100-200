package LeetCode75;

public class Day87_704_BinarySearch {

	public static void main(String[] args) {
		int[]nums= {-1,0,3,5,9,12};
		int target=9;
		System.out.println(search(nums, target));
	}
	public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
