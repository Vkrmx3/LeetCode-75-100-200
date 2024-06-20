public class Day118_154_FindMinimuminRotatedSortedArrayII
  {
    public static void main(String[]args)
    {
      int[]nums={12,23,34,45,56,67,45,1,22,22,33,44,55,55,56,56,76,1,2,3,4,5,6,7,8,9,11};
      System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start=0, end=nums.length-1, min=Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            min=Math.min(min, nums[mid]);
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                start++;
                end--; 
            }
            else if(nums[start]<=nums[mid])
            {
            	min=Math.min(min, nums[start]);
            	start=mid+1;
            }
            else
            	end=mid-1;        
        }
        return min;
    }
  }
