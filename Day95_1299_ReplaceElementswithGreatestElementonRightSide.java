public class Day95_1299_ReplaceElementswithGreatestElementonRightSide
{
    public static void main(String[]args)
    {
        int[]arr={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
        int pos=arr.length;
        int[]result=new int[pos];
        int max=-1;
        for(int i=arr.length-1; i>=0;i--)
        {
            result[--pos]=max;
            if(arr[i]> max)
                max=arr[i];
            
        }
        return result;
    }
}