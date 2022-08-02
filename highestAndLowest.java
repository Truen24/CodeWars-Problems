public class highestAndLowest {
    public static void main(String[] args) {
//        In this little assignment you are given a string of space separated
//        numbers, and have to return the highest and lowest number.
//        String myString = "1 2 3 4 5";
//        System.out.println("Result: " + highAndLow(myString));
//        highAndLow("1 2 -3 4 5") // return "5 -3"
//        highAndLow("1 9 3 4 -5") // return "9 -5"
    }
    public static String highAndLow(String numbers) {
        // Hint: Put String numbers into string array and make it equal to numbers.split(" ")
        // to get rid of spaces inside original string
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        String[] myStringArray = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < myStringArray.length; i++) {
           int value = Integer.parseInt(myStringArray[i]);
           if(value < min) {
               min = value;
           }
           if(value > max) {
               max = value;
           }
        }
        return "" + max + " " + min;
    }
}
