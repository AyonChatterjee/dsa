// Counting the vowel , consonants and whitespaces between them.

public class Count {

    private static void vowelCount(String string) {
        string = string.toLowerCase();
        int v = 0, c = 0, w = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
            } else if (ch == ' ') {
                w++;
            }
        }
        System.out.println("Vowels : " + v);
        System.out.println("Consonants : " + c);
        System.out.println("WhiteSpace : " + w);

    }

    public static void main(String[] args) {
        vowelCount("Take u forward is Awesome");
    }

}