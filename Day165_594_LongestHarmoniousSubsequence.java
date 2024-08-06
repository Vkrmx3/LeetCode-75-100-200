class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer>map=new HashMap();
        for(int ele: nums)
            map.put(ele, map.getOrDefault(ele,0)+1);
            int result=0;
        for(int key: map.keySet())
        {
            if(map.containsKey(key-1))
                result=Math.max(result, map.get(key)+map.get(key-1));
            if(map.containsKey(key+1))
                result=Math.max(result, map.get(key)+map.get(key+1));
        }
        return result;
    }
}
