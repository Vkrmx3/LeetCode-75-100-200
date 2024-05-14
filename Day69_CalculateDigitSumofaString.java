package LeetCode75;

public class Day69_CalculateDigitSumofaString {

	public static void main(String[] args) {
		String s="501456954";
		int k=3;
		System.out.println(digitSum(s, k));
	}
	public static String digitSum(String s, int k) {
		if(s.length()<=k)
            return s;
        StringBuilder result=new StringBuilder();
        int count=0;
        int temp=0;
        for(int i=0;i<s.length();i++)
        {
            count++;
            temp+=s.charAt(i)-48;
            if(count==k || i==s.length()-1)
            {
            	count=0;
            	result.append(temp);
            	temp=0;
            }
        }
        if(result.length()>k)
        	return digitSum(result.toString(), k);
        else
            return result.toString();
            
        
    }
}
