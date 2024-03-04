package LeetCode75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day10_StringCompression {

	public static void main(String[] args) {
		char[] chars = { 'a', 'a', 'b', 'b',  'c', 'c', 'c', 'c','a','a', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c','a','a' ,'c','c'};
		System.out.println(compress(chars));
		System.out.println(Arrays.toString(chars));
	}

	   public static int compress(char[] chars) {
			 if(chars.length==1)return 1;
			 String s="";
			 int count=0;
			 char a=chars[0];
	         for(int i=0;i<chars.length;i++)
	         {
	        	 char c=chars[i];
	        	 
	        	 if(a==c) count++;
	        	 else {
	        		 s+=a;
	        		 a=c;
	        		 if(count>1) {
	        			 s+=count;
	        			 count=1;
	        		 }
	        	 }
	        	 if(i==chars.length-1)
	        	 {
	        		s+=a; 
	        		if(count>1) {
	        			 s+=count;
	        		 }
	        	 }
	         }
	         int i=0;
	         for(char c:s.toCharArray())
	         {
	        	 chars[i++]=c;
	         }
	         return s.length();
		     }
	
	
	
//	public static int compress(char[] chars) {
//		if (chars.length == 1)
//			return 1;
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for (char c : chars) {
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else
//				map.put(c, 1);
//		}
//		int count = 0;
//		String s="";
//		for (Character list : map.keySet()) {
//			int n = map.get(list);
//			s+=list;
//			if(n>1)s+=n;
//			if (n == 1)
//				count++;
//			else if (n < 10)
//				count += 2;
//			else if (n < 100)
//				count += 3;
//			else if (n < 1000)
//				count += 4;
//			else
//				count += 5;
//
//		}
//		chars=s.toCharArray();
//		
//		return count;
//	}
}
