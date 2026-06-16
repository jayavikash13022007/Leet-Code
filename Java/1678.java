public class Solution {
    public String interpret(String command) {
        int i = 0;
        String word = "";
        while(i < command.length()){
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    word += 'o';
                    i += 2;
                }
                else{
                    word += "al";
                    i += 4;
            }
            }
            else{
                word += command.charAt(i);
                i++;
            }
        }
        return word;
    }
}