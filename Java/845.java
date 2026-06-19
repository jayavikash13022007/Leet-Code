class Solution {
    public int longestMountain(int[] arr) {
        int max = 0, left = 0, right = 0;
        int[] lst = new int[arr.length-1];
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] < arr[i+1]) lst[i] = 1;
            else if(arr[i] == arr[i+1]) lst[i] = 2;
        }
        for(int i = 0; i < lst.length; i++){
            if(lst[i]==1){
                if(right == 0) left++;
                else{
                    max = Math.max(max,left+right+1);
                    left = 1;
                    right = 0;
                }
            }
            else if(lst[i]==0){
                if(left != 0) right++;
            }
            else{
                if(left>0 && right >0) max = Math.max(max,left+right+1);
                left = 0;
                right = 0;
            }
        }
        if(left>0 && right >0) max = Math.max(max,left+right+1);
        return max;
    }
}