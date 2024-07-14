class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int diff=releaseTimes[0];
		char result= keysPressed.charAt(0);
		for(int i=1;i<releaseTimes.length;i++)
		{
			if(releaseTimes[i]-releaseTimes[i-1]>diff)
			{
				diff=releaseTimes[i]-releaseTimes[i-1];
				result=keysPressed.charAt(i);
			}
			else if(releaseTimes[i]-releaseTimes[i-1]==diff)
			{
				result=(char)Math.max(result, keysPressed.charAt(i));
			}
		}
		return result;
    }
}
