class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        double val = 1;
        while(val <= n){
            if(val == n) return true;
            i++;
            val = Math.pow(2,i);
        }
        return false;
    }
}