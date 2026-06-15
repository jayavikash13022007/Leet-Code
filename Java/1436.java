class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> lst1 = new ArrayList<>();
        List<String> lst2 = new ArrayList<>();
        for(int i = 0; i < paths.size(); i++){
            lst1.add(paths.get(i).get(0));
            lst2.add(paths.get(i).get(1));
        }
        for(int i = 0; i < lst2.size(); i++){
            if(!lst1.contains(lst2.get(i))) return lst2.get(i);
        }
        return "";
    }
}