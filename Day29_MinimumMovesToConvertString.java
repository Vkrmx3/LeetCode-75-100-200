package LeetCode75;

public class Day29_MinimumMovesToConvertString {

	public static void main(String[] args) {
		System.out.println(minimumMoves(new Scanner(System.in).next()));
	}
	public static int minimumMoves(String s) {
        int count=0;
        if(s.contains("X"))
        {
        	for(int i=0;i<s.length();i++)
        	{
        		if(s.charAt(i)=='X')
        		{
        			count++;
        			i+=2;
        		}
        	}
        	return count;
        }
        else
        	return 0;
        
    }
}
