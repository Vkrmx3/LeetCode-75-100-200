public class Day114_2185_CountingWordsWithaGivenPrefix
{
    public static void main(String[]args)
    {
        String[] words ={"leetcode","win","loops","success"};
        String pref="code";
        System.out.println(prefixCount(words,pref));
    }
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String ele : words) {
            if (ele.length() >= pref.length() && ele.substring(0, pref.length()).equals(pref))
                count++;
        }
        return count;
    }
}