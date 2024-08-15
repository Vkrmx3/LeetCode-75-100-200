class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i!=j)
                 {  
                    String sb=nums[i]+nums[j];
                    if(target.equals(sb))
                       count++;
                }
        return count;
    }
}
