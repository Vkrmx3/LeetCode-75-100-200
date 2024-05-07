package LeetCode75;

public class Day74_MaximumValueofaStringInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]strs= {"alic3","bob","3","4","00000"};
		System.out.println(maximumValue(strs));
	}
	public static  int maximumValue(String[] strs) {
        int result=0;
        for(String s:strs)
        {
            boolean status=false;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='a'&& s.charAt(i)<='z' )
                {
                    status=true;
                    break;
                }
            }
            if(status)
            result=Math.max(result,s.length());
            else
            result=Math.max(result,Integer.parseInt(s));
        }
        return result;
    }
}
