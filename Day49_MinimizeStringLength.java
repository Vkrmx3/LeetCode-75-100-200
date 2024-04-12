package LeetCode75;

import java.util.HashSet;
import java.util.Set;

public class Day49_MinimizeStringLength {

	public static void main(String[] args) {
		System.out.println(minimizedStringLength("aaabc"));
	}
	public static int minimizedStringLength(String s) {
        int result=s.length();
        Set<Character>set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
                result--;
            else
                set.add(c);
        }
        return result;
    }
}
