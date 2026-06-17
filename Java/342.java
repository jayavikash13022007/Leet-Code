class Solution {
    public boolean isPowerOfFour(int n) {
        int i = 0;
        double val = 1;
        while(val <= n){
            if(val == n) return true;
            i++;
            val = Math.pow(4,i);
        }
        return false;
    }
}