class Solution {
    public String reformatNumber(String number) {
        String word = "";
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) != '-' && number.charAt(i) != ' ') word += number.charAt(i);
        }
        number = "";
        int val = word.length();
        int i = 0;
        while(true){
            if(val > 4){
                number += word.substring(i,i+3) + "-";
                i += 3;
                val -= 3;
            }
            else{
                if(val == 4) number += word.substring(i,i+2) + "-" + word.substring(i+2,i+4);
                else number += word.substring(i);
                break;
            }
        }
        return number;
    }
}