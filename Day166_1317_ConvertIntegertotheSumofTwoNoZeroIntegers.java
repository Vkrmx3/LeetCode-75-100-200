class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[]arr=new int[2];
        int x=n-1;
        while(check(x) || check(n-x))
            x--;
        arr[0]=x;
        arr[1]=n-x;
        return arr;
    }
    public boolean check(int x)
    {
        while(x>0)
        {
            if(x%10==0)
                return true;
                x/=10;
        }
        return false;
    }
}
