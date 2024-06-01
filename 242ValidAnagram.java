class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        String str1=sort(s);
        String str2=sort(t);
        return str1.equals(str2);
    }

    public static String sort(String s) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
