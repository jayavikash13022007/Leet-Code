class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int n = s.length();
        int right = n-1;
        char[] c = s.toCharArray();
        char a;
        ArrayList<Character> lst = new ArrayList<>(List.of('a','e','i','o','u','A','E','I','O','U'));
        while(left<right){
            while(left<n){
                if(lst.contains(c[left])) break;
                else left++;
            }
            while(right>-1){
                if(lst.contains(c[right])) break;
                else right--;
            }
            if(left>=right) break;
            a = c[left];
            c[left] = c[right];
            c[right] = a;
            left++;
            right--;
        }
        String word = new String(c);
        return word;
    }
}