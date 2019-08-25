package zajecia_1;

import java.util.Scanner;

public class silnia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int zadanaLiczba = scan.nextInt();
        System.out.println(silnia(zadanaLiczba));


    }

    public static int silnia(int zadanaLiczba){
        if (zadanaLiczba==0) return 1;
        else return zadanaLiczba*silnia(zadanaLiczba-1);
    }
}
