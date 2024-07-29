class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
		int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int sum=0;
            if(k>0)
                for(int j=i, c=0;c<k;c++)
                  {
                	j=(((j+1)+n)%n);
                		sum+=code[j];
                  }
            else if(k<0)
                    for(int j=i,c=0; c>k;  c--)
                    {
                    	j=(((j-1)+n)%n);
                    	sum+=code[j];
                    }
            result[i]=sum;
        }
        return result;
    }
}
