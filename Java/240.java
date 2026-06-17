class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0, y = matrix[0].length - 1;
        while(true){
            try{
                if(matrix[x][y] == target) return true;
                else if(matrix[x][y] > target) y--;
                else x++;
            }
            catch(Exception e){
                return false;
            }
        }
    }
}