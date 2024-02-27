package LeetCode75;

import java.util.Scanner;

public class Day4_CanPlaceFlowers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int[]flowerbed= new int[sc.nextInt()];
		for(int i=0;i<flowerbed.length;i++)
		{
			flowerbed[i]=sc.nextInt();
		}
System.out.println(canPlaceFlowers(flowerbed, sc.nextInt()));
	}
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int l = flowerbed.length;
	        if(n == 0) return true;
	        int prev = 0;
	        for (int i = 0; i < l-1; i++) {
	            if((prev | flowerbed[i] | flowerbed[i+1]) == 0) { 
	                n--;
	                flowerbed[i] = 1;
	                if(n == 0) return true;
	            }
	            prev = flowerbed[i];
	        }
	        if((prev | flowerbed[l-1]) == 0) {
	            n--;
	        }
	        return n <= 0;
	    }
}
