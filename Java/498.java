class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0, j = 0, count = 0, n = mat.length*mat[0].length;
        int[] lst = new int[n];
        while(count != n){
            while(true){
                if(count == n) break;
                try{
                    lst[count] = mat[i][j];
                    count++;
                    i--;
                    j++;
                }
                catch(Exception e){
                    i++;
                    if(j==mat[0].length){
                        i++;
                        j--;
                    }
                    break;
                }
            }
            while(true){
                if(count == n) break;
                try{
                    lst[count] = mat[i][j];
                    count++;
                    i++;
                    j--;
                }
                catch(Exception e){
                    j++;
                    if(i==mat.length){
                        j++;
                        i--;
                    }
                    break;
                }
            }
        }
        return lst;
    }
}