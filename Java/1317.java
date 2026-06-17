class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = {n/2,n/2};
        if(n%2 == 1) arr[1]++;
        while(true){
            if(!String.valueOf(arr[0]).contains("0") && !String.valueOf(arr[1]).contains("0")) return arr;
            else{
                arr[0]--;
                arr[1]++;
            }
        }
    }
}