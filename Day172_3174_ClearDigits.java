class Solution {
    public String clearDigits(String s) {
        Stack<Character>stack=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                stack.push(s.charAt(i));
            else
                stack.pop();
        }
        StringBuilder sb=new StringBuilder();
            while(!stack.isEmpty())
                sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
