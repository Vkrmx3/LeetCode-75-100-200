class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0, sum2= 0, ten1=-1, ten2=-1;
        for(int i=0; i<player1.length; i++)
        {
            if(ten1!=-1 && i-ten1<=2)
                sum1+=2*player1[i];
            else
                {
                    ten1=-1;
                    sum1+=player1[i];
                }
            if(ten2!=-1 && i-ten2<=2)
                sum2+=2*player2[i];
            else
            {
                ten2=-1;
                sum2+=player2[i];
            }
             if(player1[i]==10)
                ten1=i;
            if(player2[i]==10)
                ten2=i;
        }
        return sum1>sum2?1:sum1<sum2?2:0;
    }
}
