class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] lst = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                for(int a = Math.max(0,i-k); a <= Math.min(mat.length-1,i+k); a++){
                    for(int b = Math.max(0,j-k); b <= Math.min(mat[0].length-1,j+k); b++){
                        lst[i][j] += mat[a][b];
                    }
                }
            }
        }
        return lst;
    }
}