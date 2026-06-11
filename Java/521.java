class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        int m = a.length(), n = b.length();
        if(m>n) return m;
        else return n;
    }
}