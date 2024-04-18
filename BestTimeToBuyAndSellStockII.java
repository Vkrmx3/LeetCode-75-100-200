package LeetCode75;

public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 4, 5 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int profit = 0, diff = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			diff = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] > prices[i]) {
					diff = prices[j] - prices[i];
					i = j;
					break;
				}
			}
			profit += diff;
			System.out.println(profit + "  " + i);
		}
		return profit;
	}
}
