class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0, duble=0;
        for(int ele:nums)
        {
            if(ele<10)
                single+=ele;
            else
                duble+=ele;
        }
        return single!=duble;
    }
}
