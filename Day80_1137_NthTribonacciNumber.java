package LeetCode75;

public class Day80_1137_NthTribonacciNumber {

	public static void main(String[] args) {
		System.out.println(tribonacci(25));
	}
	public static int tribonacci(int n) {
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        int a=0,b=1,c=1;
        for(int i=3;i<=n;i++)
        {
            int temp=a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return c;
    }
}
