import java.math.BigInteger;
class Solution {
    public String toHex(int num) {
        BigInteger a = BigInteger.valueOf(num);
        String lst = "0123456789abcdef";
        String word = "";
        int idx = 0;
        if(num==0) return "0";
        if(num<0) a = BigInteger.valueOf(2).pow(32).add(a);
        while(!a.equals(BigInteger.valueOf(0))){
            idx = a.mod(BigInteger.valueOf(16)).intValue();
            word = lst.charAt(idx) + word;
            a = a.divide(BigInteger.valueOf(16));
        }
        return word;
    }
}