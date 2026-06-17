class Solution {
    public int countPrimeSetBits(int left, int right) {
        String word = "";
        int count = 0, num = 0, flag;
        for(int i = left; i <= right; i++){
            word = Integer.toBinaryString(i);
            count = 0;
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == '1') count++;
            }
            flag = 1;
            if(count > 1){
                for(int j = 2; j < count; j++){
                    if(count%j == 0){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) num++;
            }
        }
        return num;
    }
}