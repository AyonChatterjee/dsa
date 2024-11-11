public class Non_Repeating_Char {
    private static void non_Repeating_Char(String str) {
        int[] freq = new int[200] ;
        char[] ch  = str.toCharArray() ;

        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == ' ') continue ;

            else {
                freq[(int)str.charAt(i)]++ ;
            }
        }

        /*
         * TC : O(n)
         * SC : O(n)
         */


        System.out.print("Non-Repeating Characters are: ");

        for(int i = 0 ; i < str.length() ; i++) {
            if(freq[(int)str.charAt(i)] == 1 && ch[i] != ' ') {
                System.out.print(ch[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        non_Repeating_Char("take u forward");
    }
    /*
     * Output - Non-Repeating Characters are: t k e u f o w d 
     */
}
