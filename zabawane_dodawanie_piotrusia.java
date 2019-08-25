package zajecia_1;

import java.util.Scanner;

public class zabawane_dodawanie_piotrusia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer liczbaOdwrocona = 0;
//        System.out.println("Podaj ilość liczb:");
        int t = scan.nextInt();
        if (t <= 80 && t > 0) {
            Integer[] tab = new Integer[t];
            int[] sumCounter = new int[t];
            Integer wynikowa = 0;

            Integer nextNumber;
            for (int i = 0; i < t; i++) { //uzupelnianie tablicy
//                System.out.println("Podaj kolejną liczbę:");
                do {
                    nextNumber = scan.nextInt();
//                    System.out.println(nextNumber);
                    if (nextNumber>0&&nextNumber<=80) tab[i] = nextNumber;
//                    else System.out.println("Podaj liczbę z zakresu 0-80!");
//                    System.out.println(i+" "+tab[i]);
                } while (nextNumber<0||nextNumber>80);
            }

            for (int i = 0; i < tab.length; i++) {

                sumCounter[i] = 0;
                if (tab[i] < 10) wynikowa = tab[i];
                if (istPalindrom(tab[i].toString())==true) {
                    wynikowa = tab[i];
                    sumCounter[i]=0;
                }
                if (istPalindrom(tab[i].toString()) == false && tab[i] > 9) {
                    sumCounter[i] = 1;
                    liczbaOdwrocona = Integer.valueOf(reverse(tab[i].toString()));
                    wynikowa = liczbaOdwrocona + tab[i];

                    while (!istPalindrom((wynikowa.toString()))) {


                        tab[i] = liczbaOdwrocona + tab[i];
                        liczbaOdwrocona = Integer.valueOf(reverse(tab[i].toString()));
                        wynikowa = liczbaOdwrocona + tab[i];
                        sumCounter[i]++;
                    }
                }
                tab[i] = wynikowa;
            }


            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i] + " " + sumCounter[i]);
            }
        }


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


    public static String reverse(String lancuch) {

        String odwroconyLancuch = "";
        for (int i = lancuch.length() - 1; i >= 0; i--) {
            odwroconyLancuch += lancuch.charAt(i);
        }

        return odwroconyLancuch;
    }
}

