package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day37_FindCommonCharacters {

	public static void main(String[] args) {
		
		String[] words = { "cool", "lock", "cook" };
		System.out.println(commonChars(words));
		
	}

	public static List<String> commonChars(String[] words) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words[0].length(); i++) {
			String s = words[0].charAt(i) + "";
			for (int j = 1; j < words.length; j++) {

				if (words[j].contains(s)) {
					int index = words[j].indexOf(s);
					StringBuilder sb=new StringBuilder(words[j]);
					sb.replace(index, index+1, "");
					words[j] =sb.toString();
				} else
					break;

				if (j == words.length - 1)
					list.add(s);
			}
		}
		return list;
	}
}
