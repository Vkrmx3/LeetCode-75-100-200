package LeetCode75;

public class Day73_LongerContiguousSegmentsOfOnesThanZeros {

	public static void main(String[] args) {
		System.out.println(checkZeroOnes("1101"));
	}
	public static boolean checkZeroOnes(String s) {
        int one=0,maxone=0,zero=0,maxzero=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                one++;
                maxone=Math.max(one,maxone);
                zero=0;
            }
            else{
                zero++;
                maxzero=Math.max(zero,maxzero);
                one=0;
            }
        }
        return maxone>maxzero;

    }
}
