package LeetCode75;

public class Day85_917_ReverseOnlyLetters {

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
	}
	public static String reverseOnlyLetters(String s) {
        int left=0, right=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(left<right)
        {
            char a=sb.charAt(left),
            b=sb.charAt(right);
            if(((a>='a' && a<='z')|| (a>='A' && a<='Z')) && ((b>='a' && b<='z')|| (b>='A' && b<='Z')))
            {
                sb.replace(left,left+1,b+"");
                sb.replace(right,right+1,a+"");
                left++;
                right--;
            }
            else if(a<'A' || (a>'Z' && a<'a') || a>'z')
            	left++;
            else if(b<'A' || (b>'Z' && b<'a') || b>'z')
            	right--;
        }
        return sb.toString();
    }
}
