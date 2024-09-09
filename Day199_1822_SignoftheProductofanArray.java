class Solution {
    public int arraySign(int[] nums) {
        long prod=nums[0];
        for(int i=1;i<nums.length;i++)
            {
                if(nums[i]==0)
                    return 0;
                else if(nums[i]>0)
                    prod*=1;
                else
                    prod*=-1;
            }
        if(prod>0)
            return 1;
        else if(prod<0)
            return -1;
        return 0;
    }
}
