class Solution {
    public int countOdds(int low, int high) {
        int num = high - low + 1;
        if(low%2 == 0) return num/2;
        else return (num+1)/2;
    }
}