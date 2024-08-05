class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer>map=new LinkedHashMap();
        for(String ele: arr)
            map.put(ele, map.getOrDefault(ele,0)+1);

        for(String key: map.keySet())
        {
            if(map.get(key)==1)
                k--;
            if(k==0)
                return key;
        }
        return "";
    }
}
