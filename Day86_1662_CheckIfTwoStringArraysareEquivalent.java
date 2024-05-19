package LeetCode75;

public class Day86_1662_CheckIfTwoStringArraysareEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]word1= {"abc", "d", "defg"},
				word2= {"abcddefg"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        StringBuilder s1=new StringBuilder(),
	        s2=new StringBuilder();
	        for(String ele:word1)
	            s1.append(ele);
	        for(String ele:word2)
	            s2.append(ele);
	        return s1.toString().equals(s2.toString());
	    }
}
