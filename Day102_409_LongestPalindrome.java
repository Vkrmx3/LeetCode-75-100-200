public class Day102_409_LongestPalindrome
{
    public static void main(String[]args)
    {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        int result=0;
        boolean flag=false;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            map.put(ch, map.get(ch)+1);
            else 
                map.put(ch,1);
        }
        for(char ele: map.keySet())
        {
            int size=map.get(ele);
             if(size%2==0)
                result+=size;
            else
            {
                result+=(size-1);
                flag=true;
            }
        }
        if(flag)
        result+=1;
        return result;
    }
}