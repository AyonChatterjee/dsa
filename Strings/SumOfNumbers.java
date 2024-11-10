public class SumOfNumbers {
    private static int sumOfNumbers(String s) {
        String tempSum = "0";
        int sum = 0;

        /*
           TC : O(N)
           SC : O(N) 
        */

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                tempSum = tempSum + ch;
            } else {
                sum = sum + Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }

        return sum + Integer.parseInt(tempSum);
    }

    public static void main(String[] args) {
        String str = "1bc268";
        System.out.println("Sum: " + sumOfNumbers(str));
        ;
    }
}