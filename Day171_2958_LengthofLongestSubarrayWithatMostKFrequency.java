class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0, start = 0, end = 0;
        boolean shift = false;
        Map<Integer, Integer> map = new HashMap();
        while (end < nums.length) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            max = Math.max(max, (end - start));
            while (map.get(nums[end]) > k) {
                if (map.get(nums[start]) > 0)
                    map.put(nums[start], map.get(nums[start]) - 1);
                start++;
            }
            end++;
        }
        max = Math.max(max, (end - start));
        return max;
    }
}
