class Solution {
    public int passThePillow(int n, int time) {
        int index=1;
        while(time>=n)
        {
            time-=n-1;
            if(index==1)
                index+=n-1;
            else
                index-=n-1;
        }
        if(index==1)
            index+=time;
        else
            index-=time;
        return index;
    }
}
