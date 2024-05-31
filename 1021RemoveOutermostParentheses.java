class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int flag=0;
        for(char c:s.toCharArray()) {
            if(c=='(') {
                if(flag!=0) res.append(c);
                flag++;
            } else {
                if(flag!=1) res.append(c);
                flag--;
            }
        }
        return res.toString();
    }
}
