package LeetCode75;

public class Day32_FaultyKeyboard {
public static void main(String[] args) {
	System.out.println(finalString("string"));
}
public static String finalString(String s) {
    char[]arr=s.toCharArray();
    StringBuilder result=new StringBuilder();
    for(var c:arr)
    {
        if(c=='i') result.reverse();
        else result.append(c);
    }
    return result.toString();
}
}
