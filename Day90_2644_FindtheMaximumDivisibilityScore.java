public class Day90_2644_FindMaximumDivisibilitScore
{
    public static void main(String[]args)
    {
        int[]nums={4,7,9,3,9};
        int[]divisiors={5,2,3};
        System.out.println(maxDivScore(nums,divisiors));
    }
    public static int maxDivScore(int[] nums, int[] divisors) {
        int max=Integer.MIN_VALUE, ele=0;
        for(int i=0;i<divisors.length;i++)
        {
            int count=0;
            int div=divisors[i];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%div==0)
                {
                    
                    count++;
                }
            }
            if(max==count)
            ele=Math.min(ele,div);
            else if(max<count)
            {
                max=count;
                ele=div;
            }
        }
        return ele;
    }
}