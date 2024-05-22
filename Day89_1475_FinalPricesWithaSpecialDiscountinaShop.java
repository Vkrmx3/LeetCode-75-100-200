package LeetCode75;

import java.util.Arrays;

public class Day89_1475_FinalPricesWithaSpecialDiscountinaShop {

	public static void main(String[] args) {
		int[]prices= {8,4,6,2,3};
		System.out.println(Arrays.toString(finalPrices(prices)));
	}
	public static int[] finalPrices(int[] prices) {
        int left=0, right=left+1;
        while(left<prices.length && right<prices.length)
        {
            if(prices[left]>=prices[right])
            {
                prices[left]-=prices[right];
                left++;
                right=left+1;
            }
            else if(right==prices.length-1)
                {
                    left++;
                    right=left+1;
                }
            else
                right++;
        }
        return prices;
    }
}
