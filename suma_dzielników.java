package zajecia_1;
import java.util.Scanner;

public class suma_dzielników {
    public static void main(String[] args) {

        int suma=0;
        Scanner scan = new Scanner(System.in);
        int zadanaLiczba = scan.nextInt();

        for (int i = 1; i <= zadanaLiczba; i++){
            if (zadanaLiczba%i==0) suma+=i;
        }

        System.out.println("Sama dzielników liczby "+zadanaLiczba+" to "+suma);
    }
}

