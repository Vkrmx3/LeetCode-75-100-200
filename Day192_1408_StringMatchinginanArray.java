class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>list=new ArrayList();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length; j++)
            {
                if(!list.contains(words[i]) && words[j].length()>words[i].length() && words[j].indexOf(words[i])>-1)
                    list.add(words[i]);
                    // break;
            }
        }
        return list;
    }
}
