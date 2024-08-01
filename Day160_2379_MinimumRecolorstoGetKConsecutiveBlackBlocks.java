class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0, right=0, white=0,min=Integer.MAX_VALUE;
        while(right<blocks.length())
        {
            if(blocks.charAt(right)=='W')
                white++;
            if(right-left== k-1)
            {
                min=Math.min(min,white);
                if(blocks.charAt(left)=='W')
                    white--;
                    left++;
            }
            right++;
        }
        return min;
    }
}
