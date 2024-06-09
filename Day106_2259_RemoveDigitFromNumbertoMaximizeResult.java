public class Day106_2259_RemoveDigitFromNumbertoMaximizeResult
{
    public static void main(String[]args)
    { 
      String number="1231", digit="1";
        System.out.println(removeDigit(number,digit));
    } 
    public static String removeDigit(String number, char digit) {
        String result="";
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit)
            {
                String temp=number.substring(0,i)+number.substring(i+1,number.length());
                if(temp.compareTo(result)>0)
                    result=temp;
            }
        }
        return result;
    }
}
