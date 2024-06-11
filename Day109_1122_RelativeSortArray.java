public class Day109_1122_RelativeSortArray
  {
    public static void main(String [] args)
    {
       int[]arr1={2,3,1,3,2,4,6,7,9,2,19},
         arr2={2,1,4,3,9,6};
       System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
  }
public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[]result=new int[arr1.length];
        int pos=0;
        Arrays.sort(arr1);
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length && arr1[j]<=arr2[i] ;j++)
            {
                if(arr1[j]==arr2[i])
               { result[pos++]=arr1[j];
                arr1[j]=-1;
               }
            }
        }
        for(int i=0;pos<result.length && i<arr1.length;i++)
            if(arr1[i]>-1)
                result[pos++]=arr1[i];
        return result;
    }
