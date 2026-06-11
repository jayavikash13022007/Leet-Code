import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> lst = new ArrayList<>();
        int[] arr = {n-1,m-1,0,1};
        int i = 0, j = 0, k = 0;
        int val = 0;
        while(k < m*n){
            val%=4;
            if(val==0){
                if(j<=arr[val]) lst.add(matrix[i][j++]);
                else{
                    j--;
                    i++;
                    arr[val++]--;
                    continue;
                }
            }
            else if(val==1){
                if(i<=arr[val]) lst.add(matrix[i++][j]);
                else{
                    i--;
                    j--;
                    arr[val++]--;
                    continue;
                }
            }
            else if(val==2){
                if(j>=arr[val]) lst.add(matrix[i][j--]);
                else{
                    j++;
                    i--;
                    arr[val++]++;
                    continue;
                }
            }
            else{
                if(i>=arr[val]) lst.add(matrix[i--][j]);
                else{
                    i++;
                    j++;
                    arr[val++]++;
                    continue;
                }
            }
            k++;
        }
        return lst;
    }
}