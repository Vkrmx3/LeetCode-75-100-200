class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int result=0;
       while(mainTank>4)
       {
            mainTank-=5;
            result+=5*10;
            if(additionalTank>0)
            {
                mainTank++;
                additionalTank--;
            }
       }
       result+=mainTank*10;
        return result;
    }
}
