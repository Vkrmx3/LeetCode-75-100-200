package LeetCode75;

import java.util.HashSet;
import java.util.Set;

public class Day44_FirstLetterToAppearTwice {

	public static void main(String[] args) {
//		System.out.println(repeatedCharacter("nwcn"));
		System.out.println(alter("jkodgypoya"));
		System.out.println(alter2("nwcn"));


	}
	public static char repeatedCharacter(String s) {
		char result='@';
		int min=Integer.MAX_VALUE;
		
		for(int left=0;left<s.length()-1;left++)
		{
			for(int right=left+1;right<s.length();right++)
			{
				if(s.charAt(left)==s.charAt(right)) {
					
					if(min>right) {
						min=right;
						result=s.charAt(left);
					}
					break;
				}
			}
			
		}
        return result;
    }
	
	static char alter(String s)
	{
		char result='!';
		int min=Integer.MAX_VALUE;
		Set<Character>set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(set.contains(c)) {
				if(min>i) {
					min=i;
					result=c;
				}
			}
			set.add(c);
		}
		return result;
	}
	
	static char alter2(String s)
	{
		char result='!';
		int min=Integer.MAX_VALUE;
		Set<Character>set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(set.contains(c)) {
				return c;
			}
			set.add(c);
		}
		return result;
	}
}
