package zajecia_1;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse("12345"));
        System.out.println(istPalindrom("5"));
        System.out.println(istPalindrom("121"));
        System.out.println(istPalindrom("1111"));

    }

    public static String reverse(String lancuch) {

        String odwroconyLancuch = "";
        for (int i = lancuch.length() - 1; i >= 0; i--) {
            odwroconyLancuch += lancuch.charAt(i);
        }

        return odwroconyLancuch;
    }

    public static boolean istPalindrom(String lancuch) {
        boolean palindrom = false;
        for (int i = 0; i < lancuch.length() / 2; i++) {
            if (lancuch.charAt(i) != lancuch.charAt(lancuch.length() - i - 1)) {
                palindrom = false;
            } else {
                palindrom = true;
            }
        }

        return palindrom;
    }
}

