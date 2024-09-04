class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        for(int i=0;i<n;i+=(2*k))
        {
            if(n-i<k)
	               {
	            		StringBuilder d= new StringBuilder(sb.substring(i,n)).reverse();
	            		sb.replace(i, n, d.toString());
	               }
	            else
	            {
	            	StringBuilder d= new StringBuilder(sb.substring(i,i+k)).reverse();
            		sb.replace(i, i+k, d.toString());
	            }
        }
        return sb.toString();
    }
}
