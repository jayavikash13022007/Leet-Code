class Solution {
    public int minimumSum(int num) {
        int[] lst = new int[4];
        for(int i = 0; i < 4; i++){
            lst[i] = num%10;
            num /= 10;
        }
        Arrays.sort(lst);
        return lst[0]*10+lst[2] + lst[1]*10+lst[3];
    }
}