package LeetCode75;

public class Day67_StudentAttendanceRecordI {

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP"));
	}
	public static boolean checkRecord(String s) {
        int Acount = 0, Lcount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
                Acount++;
            if (s.charAt(i) == 'L')
                Lcount++;
            else
                Lcount = 0;
            if (Acount > 1)
                return false;
            if (Lcount > 2)
                return false;
        }
        return true;
    }
}
