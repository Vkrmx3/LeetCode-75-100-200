package LeetCode75;

public class CountTheNumberOfSpecialCharactersI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='c';
		System.out.println(numberOfSpecialChars("AbBCab"));
	}
	public static int numberOfSpecialChars(String word) {
		int count=0;
		StringBuilder sb=new StringBuilder(word);
		for(int i=0;i<sb.length();i++)
		{
			char c=sb.charAt(i);
    	if(c>='a' && c<='z')
    	{
    		int index=sb.indexOf((char)(c-32)+"");
    		if(i<index && index!=-1)
    		{
    			count++;
    			while(index!=-1)
    			{
        			sb.replace(index, index+1, " ");
        			index=sb.indexOf((char)(c-32)+"");
    			}
    		}
    	}
		}
     return count;
    }
}
