class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles, a = 0;
        while(numBottles >= numExchange){
            a = numBottles % numExchange;
            numBottles /= numExchange;
            sum += numBottles;
            numBottles += a;
        }
        return sum;
    }
}