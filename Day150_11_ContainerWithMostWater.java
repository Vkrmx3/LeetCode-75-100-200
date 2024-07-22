class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, area=0, max=0, start=0, end=0;
        while(left<right)
        {
            start=height[left];
                end=height[right];
            area=Math.min(start, end)*(right-left);
            max=Math.max(area, max);
             if(start<=end)
                left++;
            else
                right--;
        }
        return max;
    }
}
