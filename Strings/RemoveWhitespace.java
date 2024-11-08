public class RemoveWhitespace {
    private static String removeWhitespace(String str) {
        str = str.toLowerCase() ;

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i) ;
        
            if(ch == ' ') {
                str = str.substring(0, i) + str.substring(i + 1) ;
            }

        }
        return str ;
    }

    public static void main(String[] args) {
        String str = "Take you forward" ;
        System.out.println("The string after removed space :" +removeWhitespace(str));
        
        // output - The string after removed space :takeyouforward
    }
}
