class Solution {
    public String reformatDate(String date) {
        Map<String,String> map = new HashMap<>(Map.of("Jan","01", "Feb","02", "Mar","03", "Apr","04", "May","05", "Jun","06", "Jul","07", "Aug","08", "Sep","09", "Oct","10"));
        map.put("Nov","11");
        map.put("Dec","12");
        if(date.charAt(1)>='a' && date.charAt(1)<='z') date = "0" + date;
        return date.substring(9) + "-" + map.get(date.substring(5,8)) + "-" + date.substring(0,2);
    }
}