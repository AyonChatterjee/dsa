public class ReverseString {
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str) ;

        int s = 0 , e = str.length() - 1 ;

        while(s < e) {
            char temp = sb.charAt(s);
            sb.setCharAt(s, str.charAt(e));
            sb.setCharAt(e, temp);

            s++ ;
            e-- ;
        }
        return sb.toString() ;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
    // Output - olleh
}
