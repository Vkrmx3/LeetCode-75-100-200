class Solution {
    public double averageWaitingTime(int[][] customers) {
        int chef=1;
        double avg=0;
        for(int i=0; i<customers.length; i++)
        {
            chef=Math.max(chef, customers[i][0])+ customers[i][1];
            avg+= chef-customers[i][0];
        } 
    return avg/customers.length;
    }
}
