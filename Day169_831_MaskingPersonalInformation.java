class Solution {
    public String maskPII(String s) {
        if (s.contains("@"))
            return Email(s.toLowerCase());
        else
            return Phone(s);
    }

    public String Email(String s) {
        StringBuilder sb = new StringBuilder();
        int at = s.indexOf("@");
        sb.append(s.charAt(0)).append("*****").append(s.charAt(at - 1)).append(s.substring(at));
        return sb.toString();
    }

    public String Phone(String s) {
        int count = 0;
        StringBuilder last = new StringBuilder(),
                sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
                if (count > 6)
                    last.append(s.charAt(i));
            }
        }
        int end = count - 10;
        for (int i = 1; i <= end; i++) {
            if (i == 1)
                sb.append("+");
            sb.append("*");
            if (i == end)
                sb.append("-");
        }
        sb.append("***-***-").append(last.substring(last.length() - 4));
        return sb.toString();
    }
}
