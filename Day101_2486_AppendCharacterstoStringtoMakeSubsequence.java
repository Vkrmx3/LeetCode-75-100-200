public class Day101_2486_AppendCharacterstoStringtoMakeSubsequence
{
    public static void main(String[]args)
    {
        System.out.println(appendCharacters("coahing","coding"));
    } 
    public static int appendCharacters(String s, String t) {
        int left=0, right=0;
        while(left<s.length()&& right<t.length())
        {
            if(s.charAt(left)==t.charAt(right))
            {
                left++;
                right++;
            }
            else
                left++;
        }
        return t.length()-right;
    }
}