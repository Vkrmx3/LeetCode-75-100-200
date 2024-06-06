public class Day104_13_RomantoInteger
{
    public static void main(String[]args)
    {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int result=0;
        Map<Character,Integer>map=new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            result+=map.get(s.charAt(0));
            for(int i=1;i<s.length();i++)
            {
                char c1=s.charAt(i), c2= s.charAt(i-1);
                if((c1=='V' || c1=='X') && c2=='I')
                    result+=map.get(c1)-(map.get(c2) + map.get(c2));
                else if((c1=='L' || c1=='C') && c2=='X')
                    result+=map.get(c1)-(map.get(c2) + map.get(c2));
                else if((c1=='D' || c1=='M') && c2=='C')
                    result+=map.get(c1)-(map.get(c2) + map.get(c2));
                else 
                    result+= map.get(c1);
            }
            return result;
    }
}