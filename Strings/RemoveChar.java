public class RemoveChar {
    private static String removeCharacter(String str) {
        String res = "" ;
        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                res = res + ch ;
            }
        }
        return res ;
    }

    public static void main(String[] args) {
        System.out.print("Resultant String : ");
        System.out.println(removeCharacter("take12% *&u ^$#forward"));
    } 
    // Output -  Resultant String : takeuforward
}
