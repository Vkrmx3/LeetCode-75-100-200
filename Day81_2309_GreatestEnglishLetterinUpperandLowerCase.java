package LeetCode75;

public class Day81_2309_GreatestEnglishLetterinUpperandLowerCase {

	public static void main(String[] args) {
		System.out.println(greatestLetter("AbCdEfGhIjK"));
	}
	public static String greatestLetter(String s) {
        char result=' ';
        for(int i=0;i<s.length();i++)
        {
        	char c=(char)(s.charAt(i)-32);
         if(s.charAt(i)>='a' && s.charAt(i)<='z' && s.contains(c+""))
        		 result= c>result?c:result;
        }
        if(result!=' ')
        return ""+result;
        return "";
    }
}
