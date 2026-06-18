class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int num = 0;
        List<Integer> lst = new ArrayList<>();
        for(int i = 2; i <= n-2; i++){
            num = n;
            lst.clear();
            while(num!=0){
                lst.add(num%i);
                num /= i;
            }
            for(int j = 0; j < lst.size()/2; j++){
                if(lst.get(j) != lst.get(lst.size()-j-1)) return false;
            }
        }
        return true;
    }
}