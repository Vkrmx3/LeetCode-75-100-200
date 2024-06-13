public class Day111_2037_MinimumNumberofMovestoSeatEveryone
{
    public static void main(String[]args)
    {
        System.out.println(minMovesToSeat(int("abccccdd"));
    }
     public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves=0;
        for(int i=0; i<seats.length; i++)
            moves+=Math.abs(seats[i]-students[i]);
        return moves;
    }
}
