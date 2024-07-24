class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0, right=0;
        double sum=0,  max=Integer.MIN_VALUE;
        while(right<nums.length)
        {
            sum+=nums[right];
            if(right-left==k-1)
            {
                max=Math.max(max,sum/k);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return max;
    }
}
