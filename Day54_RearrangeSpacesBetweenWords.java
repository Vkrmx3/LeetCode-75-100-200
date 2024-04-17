package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day54_RearrangeSpacesBetweenWords {

	public static void main(String[] args) {
		System.out.println(reorderSpaces("  hello"));
	}

	public static String reorderSpaces(String text) {
		StringBuilder result = new StringBuilder();
		List<String> list = new ArrayList<>();
		String tem = "";
		int spaceCount = 0, extraSpace = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				if (tem != "")
					list.add(tem);
				tem = "";
				spaceCount++;
			} else
				tem += text.charAt(i);

			if (i == text.length() - 1 && text.charAt(i) != ' ') {
				list.add(tem);
			}
		}
		if (spaceCount > 0) {
			int size = (list.size() > 1) ? (list.size() - 1) : list.size();
			extraSpace = spaceCount % size;
			spaceCount = spaceCount / size;
		}
		String space = "";
		while (spaceCount > 0) {
			space += " ";
			spaceCount--;
		}
		for (int i = 0; i < list.size(); i++) {
			result.append(list.get(i));
			if (i != list.size() - 1)
				result.append(space);
		}
		if (list.size() == 1)
			result.append(space);
		while (extraSpace > 0) {
			result.append(" ");
			extraSpace--;
		}
		return result.toString();
	}
}
