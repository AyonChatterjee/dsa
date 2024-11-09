public class RemoveBrackets {
    private static String removeBrackets(String str) {
        
      // TC : O(n)
      // SC : O(n)

        String temp = "" ;

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i) ;

            if(ch != '(' && ch != ')') {
                temp = temp + ch ;
            }
        }
        return temp ;
    }

    public static void main(String[] args) {
        System.out.println(removeBrackets("a+((b-c)+d)"));
    }
    // Output -  a+b-c+d

}
