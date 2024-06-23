class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int count = 0, lessthan = 0;
        for (int ele : nums) {
            if (ele == target)
                count++;
            else if (ele < target)
                lessthan++; 
        }
        List<Integer> list = new ArrayList();
        while (count > 0) {
            list.add(lessthan++);
            count--;
        }
        return list;
    }
}
