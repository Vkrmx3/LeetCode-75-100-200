package LeetCode75;

public class Day56_MaximumScoreAfterSplittingAString {

	public static void main(String[] args) {
		System.out.println(maxScore("011101"));
	}
	public static int maxScore(String s) {
	       int zero=0,one=0,result=0;
	       for(int i=0;i<s.length()-1;i++)
	       {
	        if(s.charAt(i)=='0')
	            zero++;
	            one=0;
	            for(int j=i+1;j<s.length();j++)
	                if(s.charAt(j)=='1')
	                    one++;

	        result=Math.max(result,(zero+one));
	       }
	       return result;
	    }
}
