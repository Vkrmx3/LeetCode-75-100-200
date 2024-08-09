class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x=coordinates.charAt(0)-'a'+1,
            y=coordinates.charAt(1)-'1'+1;
           
    return x%2!=y%2;
    }
}
