class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0, right=0, result=0;
        Set<Character>set=new HashSet();
        while(right<s.length())
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
           result=Math.max(result, right-left+1);
           right++;
        }
        return result;
    }
}
