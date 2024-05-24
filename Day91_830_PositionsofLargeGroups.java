public class Day91_830_PositionsofLargeGroups
{
    public static void main(String[]args)
    {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
    }
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int left = 0, right = left, count = 0;
        while (right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                count++;
                right++;
            } else if (count >= 3) {
                List<Integer> inner = new ArrayList<>();
                inner.add(left);
                inner.add(right - 1);
                result.add(inner);
                left = right;
                count = 0;
            } else {
                left = right;
                count = 0;
            }
        }
        if (count >= 3) {
            List<Integer> inner = new ArrayList<>();
            inner.add(left);
            inner.add(right - 1);
            result.add(inner);
            left = right;
        }
        return result;
    }
}