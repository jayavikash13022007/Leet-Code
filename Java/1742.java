class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> d = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        int sum,num;
        for(int i = lowLimit; i <= highLimit; i++){
            sum = 0;
            num = i;
            while(num != 0){
                sum += num%10;
                num /= 10;
            }
            try{
                d.put(sum,d.get(sum)+1);
            }
            catch(Exception e){
                lst.add(sum);
                d.put(sum,1);
            }
        }
        int max = 0;
        for(int i = 0; i < lst.size(); i++){
            max = Math.max(max,d.get(lst.get(i)));
        }
        return max;
    }
}