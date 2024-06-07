package LeetCode75;

public class Day846_HandofStraights {

	public static void main(String[] args) {
		int[] hand = {1,2,3,6,2,3,4,7,8 };
   		int groupSize=3;
		System.out.println(isNStraightHand(hand,groupSize));
	}
public static boolean isNStraightHand(int[] hand, int groupSize) {
		if(hand.length%groupSize!=0)
			return false;
		Arrays.sort(hand);
		for(int i=0;i<hand.length;i++)
			if(hand[i]>=0)
				if(!succesor(hand,i,groupSize))
					return false;
		return true;
	}
	public static boolean succesor(int[]hand, int i, int groupSize)
	{
		int ele=hand[i]+1;
		hand[i++]=-1;
		while(i<hand.length && groupSize>1)
		{
			if(hand[i]==ele)
			{
				ele++;
				hand[i]=-1;
				groupSize--;
			}
			i++;
		}
		if(groupSize>1)
			return false;
		return true;
	}
}
