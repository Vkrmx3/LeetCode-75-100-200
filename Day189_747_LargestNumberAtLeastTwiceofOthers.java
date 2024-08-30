class Solution {
    public int dominantIndex(int[] nums) {
        int first=0, second=0,index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>first)
            {
                index=i;
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second)
                second=nums[i];
        }
        if(second<=first/2)
            return index;
        return -1;
    }
}
