public class Day100_2460ApplyOperationstoanArray{
    public static void main(Strint[]args)
    {
         int[]nums={1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
        int left=0, right=0;
        while(right<nums.length)
        {
            if(nums[right]>0)
            {
                int temp=nums[right];
                nums[right++]=nums[left];
                nums[left++]=temp;
                // nums[right++]=0;
            }
            else
                right++;
        }
        return nums;
    }
}
}