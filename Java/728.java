class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        String word;
        int val,flag;
        List<Integer> lst = new ArrayList<>();
        for(int num = left; num <= right; num++){
            word = String.valueOf(num);
            if(word.contains("0")) continue;
            else{
                val = num;
                flag = 1;
                while(val != 0){
                    if((num % (val%10)) != 0){
                        flag = 0;
                        break;
                    }
                    val /= 10;
                }
                if(flag == 1) lst.add(num);
            }
        }
        return lst;
    }
}