class Solution {
    public int countGoodSubstrings(String s) {
        int left=0, right=0, count=0;
        Set<Character>set=new HashSet();
        while(right<s.length())
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
             if(right-left==2)
            {
                count++;
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            right++;
        }
        return count;
    }
}
