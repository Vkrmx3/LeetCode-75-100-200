class Solution {
    public int maximumLengthSubstring(String s) {
        int p = 0, ans = 0;
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            cnt[x]++;
            while (cnt[x] > 2)
                cnt[s.charAt(p++) - 'a']--;
            ans = Math.max(ans, i - p + 1);
        }
        return ans;
    }
}
