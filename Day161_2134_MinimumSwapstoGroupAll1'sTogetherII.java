class Solution {
    public int minSwaps(int[] nums) {
        int k=0, n=nums.length;
        for(int i=0;i<n;i++)
            if(nums[i]==1)
                k++;
        int[]arr=new int[n+k-1];
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=nums[pos];
            pos=((pos+1)+n)%n;
        }
        int left=0, right=0, swap=0, min=Integer.MAX_VALUE;
        while(right<arr.length)
        {
            if(arr[right]==0)
                swap++;
            if(right-left==k-1)
            {
                min=Math.min(min, swap);
                if(arr[left]==0)
                    swap--;
                    left++;
            }
            right++;
        }
        return min==2147483647?0: min;

    }
}
