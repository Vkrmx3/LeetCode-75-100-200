publicc class Day103_383_RansomNote
{
    public static void main(String[]args)
    {
        String ransomNote="aa",
        magazine="aba";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (map1.containsKey(ch))
                map1.put(ch, map1.get(ch) + 1);
            else
                map1.put(ch, 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if (map2.containsKey(ch))
                map2.put(ch, map2.get(ch) + 1);
            else
                map2.put(ch, 1);
        }
        for (Character key : map1.keySet()) {
            if ((map2.get(key) != null) && (map1.get(key) <= map2.get(key)))
                continue;
            else
                return false;
        }
        return true;
    }
}