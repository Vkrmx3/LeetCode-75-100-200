class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String ele : logs)
        {
            if(ele.equals("../"))
                count--;
            else if(ele.equals("./"))
                count=count;
            else 
                count++;
        count=count<1?0:count;
        }
        return count;
    }
}
