class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int left=startIndex, right=startIndex,leftcount=0, rightcount=0, n=words.length;
       while(leftcount<=n/2)
       {
        if(words[left].equals(target))
            return leftcount;
        if(words[right].equals(target))
            return rightcount;
            left=((left-1)+n)%n;
            right=(right+1)%n;
            leftcount++;
            rightcount++;
       }
        return -1;
    }
}
