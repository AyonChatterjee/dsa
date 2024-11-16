public class CheckAnagrams {
    private static boolean checkAnagrams(String s1 , String s2) {
        if(s1.length() != s2.length()) return false ;

        int[] freq = new int[26] ;

        /*
        *  TC : O(N)
        *  SC : O(1)
        */

        for(int i = 0 ; i < s1.length() ; i++) {
            freq[s1.charAt(i) - 'A']++ ;
        }
        for(int i = 0 ; i < s2.length() ; i++) {
            freq[s2.charAt(i) - 'A']-- ;
        }

        for(int i = 0 ; i < 26 ; i++) {
            if(freq[i] != 0) {
                return false ;
            }
        }

        return true ;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagrams("ACT", "CAT"));
    }

    /*
    * Output : true
    */
}
