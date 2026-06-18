class Solution {
    public String convertDateToBinary(String date) {
        return Integer.toBinaryString(Integer.valueOf(date.substring(0,4))) + "-" + Integer.toBinaryString(Integer.valueOf(date.substring(5,7))) + "-" + Integer.toBinaryString(Integer.valueOf(date.substring(8)));
    }
}