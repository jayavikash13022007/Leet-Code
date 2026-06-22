class Solution {
    public int[] minOperations(String boxes) {
        int[] lst = new int[boxes.length()];
        int count = 0;
        for(int i = 0; i < boxes.length(); i++){
            for(int j = 0; j < boxes.length(); j++){
                if(boxes.charAt(j) == '1') count += Math.abs(i-j);
            }
            lst[i] = count;
            count = 0;
        }
        return lst;
    }
}