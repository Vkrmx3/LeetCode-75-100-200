public class Day96_448_FindAllNumbersDisappearedinanArray
{
    public satic void main(String[]args)
    {
        int[]nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public satic List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list=new ArrayList<>();
        boolean[]arr=new boolean[nums.length+1];
        for(int ele:nums)
            arr[ele]=true;
        for(int i=1;i<=nums.length;i++)
            if(!arr[i])
                list.add(i);
        return list;
    }
}
