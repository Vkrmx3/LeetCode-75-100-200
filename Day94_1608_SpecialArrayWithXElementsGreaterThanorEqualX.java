public class Day94_1608_SpecialArrayWithXElementsGreaterThanorEqualX
{
    public static void main(String[]args)
    {
        int[]nums={0,4,3,0,4};
        System.ou.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        for (int i = 0; i<=nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i)
                    count++;
                if (count > i) {
                    count = -1;
                    break;
                }
            }
            if (count == i)
                    return i;
        }
        return -1;
    }
}