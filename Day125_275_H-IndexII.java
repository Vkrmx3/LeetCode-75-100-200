class Solution {
    public int hIndex(int[] citations) {
        int start=0, end=citations.length-1, len=citations.length,result=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(len-mid<=citations[mid])
               {
                result=len-mid;
                    end=mid-1;
               } 
            else
                start=mid+1;
        }
        return result;
    }
}
