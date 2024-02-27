package LeetCode75;

public class Day4_CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]flowerbed= {0,1,0};
System.out.println(canPlaceFlowers(flowerbed, 1));
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
