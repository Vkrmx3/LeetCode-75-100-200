class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0, n=colors.length;
        for(int i=0;i<n;i++)
        {
            int i2= ((i+1)+n)%n,
                i3= ((i2+1)+n)%n;
            if(colors[i]==colors[i3] && colors[i]!=colors[i2])
                count++;
        }
        return count;
    }
}
