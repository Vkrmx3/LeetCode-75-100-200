package LeetCode75;

import java.util.Arrays;

public class Day70_BuyTwoChocolates {

	public static void main(String[] args) {
		int[]prices= {1,2,2};
		int money=3;
		System.out.println(buyChoco(prices, money));
	}
	 public static int buyChoco(int[] prices, int money) {
	        Arrays.sort(prices);
	        int sum=prices[0];
	        if(prices.length>1)
	            sum+=prices[1];
	            if(money-sum>-1)
	                return money-sum;
	                return money;
	    }
}
