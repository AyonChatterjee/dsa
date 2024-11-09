public class RemoveBrackets {
    private static String removeBrackets(String str) {
        
      // TC : O(n)
      // SC : O(n)

      // using StringBuilder method for better performance

        StringBuilder temp = new StringBuilder() ;

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i) ;

            if(ch != '(' && ch != ')') {
              temp.append(ch) ;
            }
        }
        return temp.toString() ;
    }

    public static void main(String[] args) {
        System.out.println(removeBrackets("a+((b-c)+d)"));
    }
    // Output -  a+b-c+d

}
