class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0, num, left, right, n;
        for(int i = low; i <= high; i++){
            n = String.valueOf(i).length();
            if(n%2 == 1) continue;
            num = i;
            left = 0;
            right = 0;
            for(int j = 0; j < n/2; j++){
                left += num%10;
                num /= 10;
            }
            for(int j = 0; j < n/2; j++){
                right += num%10;
                num /= 10;
            }
            if(left==right) count++;
        }
        return count;
    }
}