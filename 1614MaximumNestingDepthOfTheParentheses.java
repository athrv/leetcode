class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int res=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') depth++;
            else if(s.charAt(i)==')') depth--;
            res=Math.max(res, depth);
        }
        return res;
    }
}
