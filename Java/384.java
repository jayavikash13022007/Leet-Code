class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, stop = n, mid = 0;
        while(start<=stop){
            mid = start+(stop-start)/2;
            if(guess(mid)==0) return mid;
            else if(guess(mid)==1) start = mid+1;
            else stop = mid - 1;
        }
        return -1;
    }
}