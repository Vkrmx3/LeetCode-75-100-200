package LeetCode75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day3_KidsWithTheGreatestNumberOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]candies= {2,3,5,1,3};
System.out.println(kidsWithCandies(candies, sc.nextInt()));
	}
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bol = new ArrayList<>();
        int maxCandy = candies[0];
        for(int i:candies)
        maxCandy=maxCandy>i?maxCandy:i;

        for (int i : candies)
            bol.add(i + extraCandies >= maxCandy);

        return bol;
    }
}
