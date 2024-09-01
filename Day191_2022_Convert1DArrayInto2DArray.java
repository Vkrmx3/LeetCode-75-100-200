class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)
            return new int[0][0];
        int result[][]=new int[m][n];
        for(int i=0,r=0,c=0;i<original.length;i++)
        {
            result[r][c++]=original[i];
            if(c==n)
            {
               r++; 
               c=0;
            }  
        }
        return result;
    }
}
