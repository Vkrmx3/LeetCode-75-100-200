class Solution {
    public int maxVowels(String s, int k) {
        int left=0, right=0, vc=0, max=0;
        while(right<s.length())
        {
            if("aeiou".indexOf(s.charAt(right))>-1)
                vc++;
            if(right-left==k-1)
            {
                max=Math.max(max,vc);
                if("aeiou".indexOf(s.charAt(left))>-1)
                vc--;
                left++;
            }
            right++;
        }
        return max;
    }
}
