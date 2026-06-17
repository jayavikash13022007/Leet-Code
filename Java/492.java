class Solution {
    public int[] constructRectangle(int area) {
        int[] lst = new int[2];
        for(int i = 1; i*i <= area; i++){
            if(area%i == 0) lst[1] = i;
        }
        lst[0] = area/lst[1]; 
        return lst;
    }
}