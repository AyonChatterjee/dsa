public class RemoveVowels {
    private static String removeVowels(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str = str.substring(0, i) + str.substring(i + 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("take u forward"));
    }
}
