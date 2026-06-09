class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "";
        while(columnNumber != 0){
            s = (char)((columnNumber - 1)%26 + 65) + s;
            if(columnNumber%26 == 0){
                columnNumber -= 26;
            }
            columnNumber /= 26;
        }
        return s;
    }
}