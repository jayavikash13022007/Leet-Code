class Solution {
    public int findTheWinner(int n, int k) {
        int idx = 0;
        List<Integer> lst = new ArrayList<>();
        for(int i = 1; i <= n; i++) lst.add(i);
        while(lst.size()>1){
            idx += k-1;
            idx %= lst.size();
            lst.remove(idx);
        }
        return lst.get(0);
    }
}