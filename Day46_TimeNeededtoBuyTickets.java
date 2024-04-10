package LeetCode75;

public class Day46_TimeNeededtoBuyTickets {

	public static void main(String[] args) {
		int[]tickets= {5,1,1,1};
		int k=0;
		System.out.println(timeRequiredToBuy(tickets, k));
		System.out.println(alter(tickets, k));
	}
	
	
	static int alter(int[]tickets,int k)
	{
		int time=0;
		for(int i=0; tickets[k]>0;i++)
		{
			if(tickets[i]>0)
				{
				tickets[i]--;
				time++;
				}
			
			if(i==tickets.length-1)i=-1;
		}
		return time;
	}

	
	 public static int timeRequiredToBuy(int[] tickets, int k) {
	        int total = 0;

	        for (int i = 0; i < tickets.length; i++) {
	            if (i <= k) {
	                total += Math.min(tickets[i], tickets[k]);
	            } else {
	                total += Math.min(tickets[i], tickets[k] - 1);
	            }
	        }

	        return total;
	    }
}
