public class Solution {
    public int dayOfYear(String date) {
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.valueOf(date.substring(0,4));
        int month = Integer.valueOf(date.substring(5,7));
        int day = Integer.valueOf(date.substring(8));
        for(int i = 0; i < month-1; i++) day += arr[i];
        if(year%4 == 0 && year != 1900 && month > 2) day++;
        return day;
    }
} 