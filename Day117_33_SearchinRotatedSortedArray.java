public class Day117_33_SearchinRotatedSortedArray
  {
  public static void main(String[]args)
    {
      int[]nums={78,88,89,91,93,96,97,99,2444,1,2,3,4,5,6,7,8,9,34};
      System.out.println(search(nums, 45));
    }
    public static int search(int[] nums, int target) 
    {
        int start=0, end=nums.length-1;
	        while(start<=end)
	        {
	        	int mid=start+(end-start)/2;
	        	if(nums[mid]==target)
	        		{
	        		System.out.println(nums[mid]);
	        		return mid;
	        		}
	        	else if(nums[start]<=nums[mid]) 
	        	{
	        		if(nums[start]<=target && nums[mid]>target )
	        			end=mid-1;
	        		else
	        			start=mid+1;
	        	}
	        	else
	        	{
	        		if(nums[mid]<=target && nums[end]>=target )
	        			start=mid+1;
	        		else
	        			end=mid-1;
	        	}
	        }
	        return -1;
    }

  }
