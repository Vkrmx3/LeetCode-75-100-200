class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer>stack=new Stack();
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='(')
				stack.push(i);
			else if(sb.charAt(i)==')')
			{
				int start=stack.pop();
				StringBuilder temp=new StringBuilder(sb.substring(start+1,i));
				temp.reverse();
				sb.replace(start, i+1, temp.toString());
				i-=2;
			}
		}
		
		return sb.toString();
    }
}
