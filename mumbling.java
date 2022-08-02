public class mumbling {
    public static void main(String[] args) {
//        This time no story, no theory. The examples below show you how to write function accum:
//        Examples
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"
    }
    public static String accum(String s) {
        int count = 0;
        String tempString = "";
        String finalString = "";
        for(int i = 0; i < s.length(); i++) {
            s = s.toLowerCase();
            count++;
            tempString += s.charAt(i);
            String firstLetter = tempString.substring(0,1).toUpperCase() + tempString.substring(1);
            finalString += firstLetter + tempString.repeat(count-1) + "-";
            tempString = "";
        }
        return finalString.substring(0, finalString.length() - 1);
    }
}
