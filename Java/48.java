class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, temp;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < i; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}