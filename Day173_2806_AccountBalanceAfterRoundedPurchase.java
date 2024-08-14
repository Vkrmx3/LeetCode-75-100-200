class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int digit=purchaseAmount%10;
        if(digit<5)
            purchaseAmount-=digit;
        else
            purchaseAmount+=10-digit;        
        return 100-purchaseAmount;
    }
}
