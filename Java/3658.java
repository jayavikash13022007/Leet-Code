class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = 0, b = 0, gcd = 1;
        for(int i = 1; i <=2*n; i++){
            if(i%2 == 0) a += i;
            else b += i;
        }
        for(int i = 2; i <= Math.min(a,b); i++){
            if(a%i==0 && b%i==0) gcd = i;
        }
        return gcd;
    }
}