public class Day97_1748_SumofUniqueElements
{
    public static void main(String[]args)
    {
        int[]nums={1,3,2,3,4,,5,66,4,6};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int ele : nums)
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
                if (map.get(ele) == 2)
                    sum -= ele;
            } else {
                map.put(ele, 1);
                sum += ele;
            }
        return sum;
    }
}