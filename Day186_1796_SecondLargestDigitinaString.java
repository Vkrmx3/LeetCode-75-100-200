class Solution {
    public int secondHighest(String s) {
        Set<Integer>set=new TreeSet();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)>='0'&& s.charAt(i)<='9')
                set.add(Integer.parseInt(s.substring(i,i+1)));
        if(set.size()>1)
        {
            int count=0;
            for(int ele:set)
            {
                count++;
                if(count==set.size()-1)
                    return ele;
            } 
        }
        return -1;
    }
}
