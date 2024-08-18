class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left=0, right=0, one=0, zero=0, count=0;
        while(right<s.length())
        {
            if(s.charAt(right)=='1')
                one++;
            else
                zero++;
            while(one>k && zero>k)
            {
                if(s.charAt(left)=='1')
                    one--;
                else
                    zero--;
                left++;
            }
                count+=right-left+1;
                right++;
        }
        return count;
    }
}
