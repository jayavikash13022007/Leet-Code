class Solution {
    public List<String> recurse(int n, String current, List<String> lst){
        if(n==0){
            if(!lst.contains(current)) lst.add(current);
            return lst;
        }
        for(int i = 0; i <= current.length()/2; i++) lst = recurse(n-1,current.substring(0,i) + "()" + current.substring(i),lst);
        return lst;
    }
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        lst = recurse(n,"",lst);
        return lst;
    }
}