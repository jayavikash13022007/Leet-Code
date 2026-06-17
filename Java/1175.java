class Solution {
    public int numPrimeArrangements(int n) {
        long res = 1, count  = 0, flag;
        for(int i = 2; i <= n; i++){
            flag = 1;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) count++;
        }
        for(int i = 2; i <= count; i++){
            res *= i;
            res %= 1000000007;
        }
        for(int i = 2; i <= n-count; i++){
            res *= i;
            res %= 1000000007;
        }
        return (int)res;
    }
}