public class CalculateFrequency {

    private static void calculateFrequency(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length() - 1; i++) {
            freq[str.charAt(i) - 'a']++;
        }

        /*
         * TC - O(n) + O(26) can be written as O(n) + O(1) = O(n)
         * SC - O(26) as it is a fixed size , it is : O(1)
         */

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.print((char) (i + 'a')); // it will give the character.
                System.out.print(freq[i] + " "); // it will give the frequency of a particular character.
            }
        }
    }

    public static void main(String[] args) {
        String str = "takeuforward";
        calculateFrequency(str);
    }
    /*
     * Output - a2 e1 f1 k1 o1 r2 t1 u1 w1
     */
}
