public class Day113_1827_MinimumOperationstoMaketheArrayIncreasing
{
    public static void main(String[]args)
    {
        int[]nums ={1,5,2,4,1};
        System.out.println(minOperations(nums));
    }
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int ele= nums[i-1]+1;
                count+=ele-nums[i];
                nums[i]=ele;
            }
        }
        return count;
    }}