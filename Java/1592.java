class Solution {
    public String reorderSpaces(String text) {
        String[] arr = text.trim().split("\\s+");
        int n = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' ') n++;
        }
        String word = arr[0];
        if(arr.length == 1) return word + " ".repeat(n);
        for(int i = 1; i < arr.length; i++) word += " ".repeat(n/(arr.length-1)) + arr[i];
        word += " ".repeat(n%(arr.length-1));
        return word;
    }
}