class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles;
        while(empty>=numExchange )
        {
            empty-=numExchange-1;
            numBottles++;
        }
        returnS numBottles; 
    }
}
