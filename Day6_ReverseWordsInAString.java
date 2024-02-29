package LeetCode75;

import java.util.Arrays;
import java.util.Scanner;

public class Day6_ReverseWordsInAString {

	public static void main(String[] args) {
System.out.println(reverseWords(new Scanner(System.in).nextLine()));
	}
	 private static String reverseWords(String s) {
		String ss[]=s.trim().split("\\s+");
		s="";
		for(int i=ss.length-1;i>=0;i--)
		{
			if(!ss[i].equals(""))
			{
				s+=ss[i];
				if(i>0)s+=" ";			}
			
		}
		 return s;
	        
	    }
}
