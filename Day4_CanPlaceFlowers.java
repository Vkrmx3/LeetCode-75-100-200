package LeetCode75;

public class Day4_CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]flowerbed= {0,1,0};
System.out.println(canPlaceFlowers(flowerbed, 1));
	}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(i==0&&flowerbed[i]==0&& flowerbed[i+1]==0)
            {
               count++;
               System.out.println("1");
            }
            
            else
            if(i==flowerbed.length-1&& flowerbed[i]==0&&flowerbed[i-1]==0)
            {
                count++;
                System.out.println("3"); 	
            }
            else
                if(flowerbed[i]==0&&flowerbed[i+1]==0&&flowerbed[i-1]==0)
                {
                    count++;
                    ++i;
                    System.out.println("2");
                    System.out.println(count+" "+i);
                }

        }
        return count==n;
        
    }
}
