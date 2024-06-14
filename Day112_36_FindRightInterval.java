public class Day112_36_FindRightInterval
{
    public static void main(String[]args)
    {
        int[][]intervals ={{3,4},{2,3},{3,4}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    public int[] findRightInterval(int[][] intervals) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<intervals.length;i++)
            map.put(intervals[i][0], i);
        int[] result = new int[intervals.length];
        for (int i=0; i<intervals.length;i++) {
            Integer key = map.ceilingKey(intervals[i][1]);
                result[map.get(intervals[i][0])] = key != null? map.get(key) : -1;

        }

        return result;
    }
}