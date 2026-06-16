import java.util.*;
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        List<Character> arr = new ArrayList<>();
        int n = releaseTimes.length;
        int[] lst = new int[n];
        lst[0] = releaseTimes[0];
        int max = lst[0];
        for(int i = 1; i < n; i++){
            lst[i] = releaseTimes[i] - releaseTimes[i-1];
            max = Math.max(max,lst[i]);
        }
        for(int i = 0; i < n; i++){
            if(lst[i] == max) arr.add(keysPressed.charAt(i));
        }
        Character a = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) > a) a = arr.get(i);
        }
        return a;
    }
}