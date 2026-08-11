class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(char ch: num.toCharArray()){
            while(!s.isEmpty() && k>0 && s.peek()>ch){
                s.pop();
                k--;
            }
            s.push(ch);
        }
        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())sb.append(s.pop());
        sb.reverse();
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0')i++;
        String ans=sb.substring(i);
        return ans.isEmpty()?"0":ans;
    }
}