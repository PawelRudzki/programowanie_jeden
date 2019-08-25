package zajecia_1;

import java.util.Scanner;

public class wartosc_absolutna_liczby {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać liczbę:");
        int liczba = scan.nextInt();
        System.out.println(Math.abs(liczba));
    }
}
