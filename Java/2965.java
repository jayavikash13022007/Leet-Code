class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length*grid[0].length];
        int[] lst = new int[2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                arr[grid[i][j]-1]++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==2) lst[0] = i+1;
            if(arr[i]==0) lst[1] = i+1;
        }
        return lst;
    }
}