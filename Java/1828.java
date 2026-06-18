class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] lst = new int[queries.length];
        double distance;
        for(int i = 0; i < queries.length; i++){
            for(int j = 0; j < points.length; j++){
                distance = Math.sqrt((queries[i][0]-points[j][0])*(queries[i][0]-points[j][0]) + (queries[i][1]-points[j][1])*(queries[i][1]-points[j][1]));
                if(distance <= (double)queries[i][2]) lst[i]++;
            }
        }
        return lst;
    }
}