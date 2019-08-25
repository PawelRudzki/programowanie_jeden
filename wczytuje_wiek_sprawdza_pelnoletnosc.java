package zajecia_1;
import java.util.Scanner;

public class wczytuje_wiek_sprawdza_pelnoletnosc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać swój wiek:");
        int wiek = scan.nextInt();
        if (wiek < 0 ) System.out.println("Nieprawidłowa wartość! Wiek nie może być ujemny!");
        if (wiek >17 ) System.out.println("Pełnoletność potwierdzona.");
        else System.out.println("Pełnoletność niepotwierdzona.");




    }
}
