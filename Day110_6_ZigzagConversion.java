public class Day110_6_ZigzagConversion
{
    public static void main(String[]args)
    {
        String s="PAYPALISHIRING";
        int numRows=3;
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
        if(numRows==1)
			return s;
		StringBuilder result=new StringBuilder();
		int index=(numRows-1)*2, step=(numRows-1)*2;
		for(int i=0;i<numRows;i++)
		{
			for(int j=i;j<s.length();j+=index)
			{
                result.append(s.charAt(j));
				if(j+step<s.length() && i>0 && i<numRows-1)
					result.append(s.charAt(j+step));
			}
			step-=2;
		}
		return result.toString();
        
    }
}