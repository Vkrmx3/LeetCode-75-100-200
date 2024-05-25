package LeetCode75;

import java.util.Stack;

public class Day92_844_BackspaceStringCompare {

	public static void main(String[] args) {
		String s="y#fo##f",
				t="y#f#o##f";
		System.out.println(backspaceCompare(s, t));
	}
	public static boolean backspaceCompare(String s, String t) {
        Stack<Character>st1=new Stack<>();
        Stack<Character>st2=new Stack<>();
        int left=0, right=0;
        while(left<s.length() || right<t.length())
        {
            if(left<s.length())
            {
                if(s.charAt(left)=='#')
                {
                	if(!st1.isEmpty())
                    st1.pop();
                }
                else 
                    st1.push(s.charAt(left));
                    left++;
            }
            if(right<t.length())
            {
                if(t.charAt(right)=='#')
                {
                	if(!st2.isEmpty())
                    st2.pop();
                }
                else 
                    st2.push(t.charAt(right));
                    right++;
            }
        }
        System.out.println(st1);
        System.out.println(st2);
        return st1.equals(st2);
    }
}
