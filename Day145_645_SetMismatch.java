class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]result=new int[2];
      boolean[]set=new boolean[nums.length+1];
        for(int ele:nums)
        {
           if(set[ele])
            result[0]=ele;
            set[ele]=true;
        }
        for(int ele=1;ele<=nums.length;ele++)
        {
            if(!set[ele])
            {
                result[1]=ele;
                return result;
            }

        }
        return result;
    }
}
