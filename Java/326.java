class Solution {
    public boolean isPowerOfThree(int n) {
        int i = 0;
        double val = 1;
        while(val <= n){
            if(val == n) return true;
            i++;
            val = Math.pow(3,i);
        }
        return false;
    }
}