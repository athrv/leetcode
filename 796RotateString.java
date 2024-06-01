class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        for(int i=0; i<s.length(); i++) {
            if(rotate(s, goal, i)) return true;
        }
        return false;
    }

    public boolean rotate(String s, String goal, int rotation) {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=goal.charAt((i+rotation)%goal.length())) return false;
        }
        return true;
    }
}
