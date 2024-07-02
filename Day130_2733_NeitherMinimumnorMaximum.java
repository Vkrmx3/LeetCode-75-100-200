class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3)
        return -1;
        int min=Integer.MAX_VALUE, result=min;
        for(int ele: nums)
        {
            if(ele<min)
            {
                result=min; 
                min=ele;
            }
            else if(ele<result)
            {
                result=ele;
            }
        }
        return result;
    }
}
