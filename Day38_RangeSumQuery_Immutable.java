package LeetCode75;

public class Day38_RangeSumQuery_Immutable {

	public static void main(String[] args) {
		int[]nums={-2, 0, 3, -5, 2, -1};
		NumArray num=new NumArray(nums);
		System.out.println(num.sumRange(0,3));
	}
	
}
class NumArray {
    int[]nums;
    public NumArray(int[] nums) {
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(;left<=right;left++)
        {
            sum+=nums[left];
        }
        return sum;
    }
}
