class Solution {
    public int numberOfBeams(String[] bank) {
        int sum = 0,val = 0,count;
        for(int i = 0; i < bank.length; i++){
            count = 0;
            for(int j = 0; j < bank[0].length(); j++){
                if(bank[i].charAt(j) == '1') count++;
            }
            sum += val*count;
            if(count != 0) val = count;
        }
        return sum;
    }
}