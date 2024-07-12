class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder(title);
        int start = 0, i = 0;
        for (; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                if (i - start > 2) {
                    sb.replace(start, start + 1, sb.substring(start, start + 1).toUpperCase());
                    sb.replace(start + 1, i, sb.substring(start + 1, i).toLowerCase());
                    start = i + 1;
                } else {
                    // System.out.println(sb.charAt(i)+" "+i+" "+start);
                    sb.replace(start, i, sb.substring(start, i).toLowerCase());
                    start = i + 1;
                }
            }
        }
        if (i - start > 2) {
            sb.replace(start, start + 1, sb.substring(start, start + 1).toUpperCase());
            sb.replace(start + 1, i, sb.substring(start + 1, i).toLowerCase());
            start = i + 1;
        } else if (i - start > 0) {
            // System.out.println(sb.charAt(i)+" "+i+" "+start);
            sb.replace(start, i, sb.substring(start, i).toLowerCase());
            start = i + 1;
        }
        return sb.toString();
    }
}
