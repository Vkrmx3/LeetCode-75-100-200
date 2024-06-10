publicc class Day108_560_SubarraySumEqualsK
{
    public static void main(String[]args)
    {
        int[]nums={1,2,3};
        int k=2;
        System.out.println(subarraySum(nums,k));
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int presum = 0, count = 0;
        for (int ele : nums) {
            if (map.containsKey(presum))
                map.put(presum, map.get(presum) + 1);
            else
                map.put(presum, 1);

            presum += ele;
            if (map.containsKey(presum - k))
                count += map.get(presum - k);
        }
        return count;
    }
}