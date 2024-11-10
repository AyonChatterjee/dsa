public class CapitalizeFirstLast {
    private static String capitalizeFirstLast(String str) {

        StringBuilder sb  = new StringBuilder(str) ; 

        /*
           TC : O(n)
           SC : O(n) 
        */

        for(int i = 0 ; i < str.length() ; i++) {

            if(i == 0 || i == str.length() - 1) {
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(str.charAt(i) == ' ') {
                sb.setCharAt(i - 1, Character.toUpperCase(str.charAt(i - 1))); 
                sb.setCharAt(i + 1, Character.toUpperCase(str.charAt(i + 1))); 
            }
        }
        return sb.toString() ;
    }
    public static void main(String[] args) {
        String str = "take u forward is awesome" ;
        System.out.println("Revised String : " +capitalizeFirstLast(str));
    }

    /* Output - Revised String : TakE U ForwarD IS AwesomE  */
}
