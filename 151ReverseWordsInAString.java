class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        String res="";
        while(i>=0) {
            while(i>=0 && s.charAt(i)==' ') i--;
            int j=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(res.isEmpty()) res=res.concat(s.substring(i+1, j+1));
            else res=res.concat(" "+s.substring(i+1, j+1));
        }
        return res;
    }
}
