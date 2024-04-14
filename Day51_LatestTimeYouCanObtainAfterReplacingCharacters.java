package LeetCode75;

public class Day51_LatestTimeYouCanObtainAfterReplacingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLatestTime("0?:1?"));
	}
	public static String findLatestTime(String s) {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            if(i==0 && s.charAt(i)=='?')
            {
                if(s.charAt(i+1)=='1' || s.charAt(i+1)=='?') {
                    result+=1;
                }
                else if(s.charAt(i+1)=='0')
                	result+='1';
                else {
                	result+=0;
                }
                    
            }
            else if(i==1 && s.charAt(i)=='?')
            {
            	if(result.charAt(0)=='1') 
            		result+=1;
            	else
            		result+=9;
            }
            else if(i==3 && s.charAt(i)=='?')
                  	result+=5;
            else if(i==4 && s.charAt(i)=='?')
            		result+=9;
            else
            	result+=s.charAt(i);
            
        }
        return result;
    }
}
