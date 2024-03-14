package LeetCode75;

public class Day20_DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(detectCapitalUse("Leet"));
	}
	 public static boolean detectCapitalUse(String word) {
		
		 int Ucount = 0, Lcount = 0;
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i) <= 'Z')
	                Ucount++;
	            else if (word.charAt(i) >= 'a')
	                Lcount++;
	        }
	        if (Ucount == word.length() | Lcount == word.length() | (word.charAt(0) <= 'Z' &
	         Lcount == word.length() - 1))
	            return true;
	        return false;
	        
		
//		 String upper=word.toUpperCase(),lower=word.toLowerCase(),Fupper=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
//	       System.out.println(Fupper.equals(word));
//	        if(word==upper|lower==word|Fupper==word)return true;return false;
		 
	    }
}
