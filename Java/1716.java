class Solution {
    public int totalMoney(int n) {
        int count = 0, sum = 0,j;
        for(int i = 0; i < n; i++){
            count = i/7;
            j = i%7;
            sum += j+count+1;
        }
        return sum;
    }
}