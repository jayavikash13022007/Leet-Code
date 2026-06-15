class Solution {
    public boolean isPathCrossing(String path) {
        List<List<Integer>> lst = new ArrayList<>();
        int x = 0, y = 0;
        lst.add(Arrays.asList(0,0));
        for(int i = 0; i < path.length(); i++){
            switch(path.charAt(i)){
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                default -> x--;
            }
            if(lst.contains(Arrays.asList(x,y))) return true;
            else lst.add(Arrays.asList(x,y));
        }
        return false;
    }
}