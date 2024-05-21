package LeetCode75;

public class Day88_1287_ElementAppearingMoreThan25InSortedArray {

	public static void main(String[] args) {
		int[]arr= {1,2,2,6,6,6,6,7,10};
		System.out.println(findSpecialInteger(arr));
	}
	public static int findSpecialInteger(int[] arr) {
        int left = 0, right = left, count = 0, max = 0, ele = 0;
        while (right < arr.length) {
            if (arr[left] == arr[right]) {
                count++;
                right++;
            } else {
                if (max < count) {
                    max = count;
                    ele = arr[left];
                }
                left = right;
                count = 0;
            }
        }
        if (max < count) {
            max = count;
            ele = arr[left];
        }
        return ele;
    }
}
