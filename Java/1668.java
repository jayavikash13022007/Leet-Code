class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = word.length(), max = 0;
        int[] arr = new int[sequence.length()+1];
        for(int i = n; i <= sequence.length(); i++ ){
            if(sequence.substring(i-n,i).equals(word)){
                arr[i] = arr[i-n] + 1;
                max = Math.max(max,arr[i]);
            }
        }
        return max;
    }
}