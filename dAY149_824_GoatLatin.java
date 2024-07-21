class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder(sentence),
         a= new StringBuilder("a"), 
         ma=  new StringBuilder("ma");
         int start=0, end=0;
         while(end<sb.length())
         {
            if(sb.charAt(end)==' ' || end==sb.length()-1)
            {
                StringBuilder repl=new StringBuilder();
                if("aeiou".indexOf(sb.charAt(start))>-1 || "AEIOU".indexOf(sb.charAt(start))>-1 )
                     if( end==sb.length()-1)
                        repl.append( sb.substring(start, end+1) );
                    else
                    repl.append(sb.substring(start,end));
                else
                {
                    if( end==sb.length()-1)
                        repl.append( sb.substring(start+1, end+1) );
                    else
                    repl.append( sb.substring(start+1, end) );
                    repl.append( sb.substring(start, start+1));
                }
                repl.append(ma);
                repl.append(a);
                a.append("a");
                if( end==sb.length()-1)
                    sb.replace(start, end+1, repl.toString());
                else
                sb.replace(start, end, repl.toString());
                end= start+repl.length();
                start=end+1;
                System.out.println(sb);
            }
            end++;
         }
         return sb.toString();
    }
}
