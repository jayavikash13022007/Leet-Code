class Solution {
    public int largestMagicSquare(int[][] grid) {
        int sum = 0, val = 0;
        for(int k = Math.min(grid.length,grid[0].length); k>1; k--){
            for(int i = 0; i <= grid.length-k; i++){
                for(int j = 0; j <= grid[0].length-k; j++){
                    target:{
                    sum = 0;
                    val = 0;
                    for(int a = 0; a < k; a++) val += grid[i+a][j+a];
                    for(int a = 0; a < k ;a++) sum += grid[i+a][j+k-1-a];
                    if(val != sum) break target;
                    sum = 0;
                    for(int a = i; a < i+k; a++){
                        for(int b = j; b < j+k; b++) sum += grid[a][b];
                        if(val != sum) break target;
                        sum = 0;
                    }
                    for(int a = j; a < j+k; a++){
                        for(int b = i; b < i+k; b++) sum += grid[b][a];
                        if(val != sum) break target;
                        sum = 0;
                    }
                    return k;
                    }
                }
            }
        }
        return 1;
    }
}