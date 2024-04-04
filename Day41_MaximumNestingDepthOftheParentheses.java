package LeetCode75;

public class Day41_MaximumNestingDepthOftheParentheses {

	public static void main(String[] args) {
		System.out.println(maxDepth("(1)+((2))+(((3)))"));
	}
	public static int maxDepth(String s) {
        int count=0,result=0;
        for(char c:s.toCharArray())
        {
        	if(c=='(')count++;
        	if(c==')')count--;
        	result=Math.max(count, result);
        }
        return result;
    }
}
