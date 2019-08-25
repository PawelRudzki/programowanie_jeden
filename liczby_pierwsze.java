package zajecia_1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class liczby_pierwsze {
    public static void main(String[] args) {
        boolean[] wynik;
        int liczba = 0, licznik;

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0 && n < 1000) {
            wynik = new boolean[n];
            for (int i = 0; i < n; i++) {
                liczba = scan.nextInt();
                licznik = 0;
                if (liczba==1) licznik=3;
                for (int j = 1; j <= liczba; j++) {
                    if (liczba % j == 0) licznik++;
                }

                if (licznik > 2) {
                    wynik[i] = false;
                } else wynik[i] = true;
            }

            for (int i = 0; i < n; i++) {
                if (wynik[i] == true) System.out.println("TAK");
                if (wynik[i] == false) System.out.println("NIE");

            }

        } else System.out.println("Wybierz liczbę z przedziału 1-1000!");

    }
}

