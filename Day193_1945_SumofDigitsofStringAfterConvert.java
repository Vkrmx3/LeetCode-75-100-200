class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
            sb.append(s.charAt(i)-'a'+1);
            int sum=0;
		for(int i=0;i<sb.length();i++)
		{
			sum+=Integer.parseInt(sb.charAt(i)+"");
		}
        int res=sum;
        while(k>1)
        {
            sum=res;
            res=0;
            while(sum>0)
            {
                res+=sum%10;
                sum/=10;
            }
            k--;
        }
     return res;
      
    }
}
