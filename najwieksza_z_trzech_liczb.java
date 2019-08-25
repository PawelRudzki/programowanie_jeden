package zajecia_1;

import java.util.Scanner;

public class najwieksza_z_trzech_liczb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Proszę podać liczbę 1:");
        int liczba1 = scan.nextInt();

        System.out.println("Proszę podać liczbę 2:");
        int liczba2 = scan.nextInt();
        if (liczba2 >= liczba1) liczba1=liczba2;

        System.out.println("Proszę podać liczbę 3:");
        int liczba3 = scan.nextInt();

        if (liczba1>=liczba3) System.out.println("Największa jest:"+liczba1);
        else System.out.println("Największa jest:"+liczba3);

    }
}
