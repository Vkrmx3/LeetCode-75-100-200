class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer>set=new HashSet();
        int count=0, len=nums.length;
        for(int ele:nums)
        {
            if(set.contains(ele))
            {
                set.remove(ele);
                count++;
                len-=2;
            }
            else
            set.add(ele);
        }
        return new int[]{count,len};
    }
}
