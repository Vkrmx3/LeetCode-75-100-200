package LeetCode75;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_MaximumOddBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(maximumOddBinaryNumber(new Scanner(System.in).next()));
	}
	public static String maximumOddBinaryNumber(String s) {
		
        if(s.length()==1)return s;
        else if(s.length()==2&&s.charAt(1)=='1')return s;
        	char[]arr=s.toCharArray();
        	int pos=arr.length-2;
        	if(arr[arr.length-1]!='1')
        	{
        		for(int i=arr.length-1;i>=0;i--)
                {
                    if(arr[i]=='1')
                    {
                    	arr[i]='0';
                    	arr[arr.length-1]='1';
                    	pos=i;
                    	break;
                    }
                }
        	}
        	int i=0;
        	while(pos>i)
        	{
        		if(arr[pos]=='1'&&arr[i]=='0')
        		{
        			arr[pos]='0';
        			arr[i]='1';
        			i++;
        			pos--;
        		}
        		else if(arr[i]!='0')i++;
        		else if(arr[pos]!='1')pos--;
        	}
        	
        
        return new String(arr);
    }
}
