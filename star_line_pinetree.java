package zajecia_1;

import java.util.ArrayList;
import java.util.Scanner;

public class star_line_pinetree {
    public static void main(String[] args) {
        drawTree();

    }

    public static void drawTree(){
        Scanner scan = new Scanner(System.in);
        int numberOfLines;
        System.out.println("Podaj wysokość drzewa:");
        numberOfLines = scan.nextInt();
        drawTriangle(numberOfLines);
        drawSquare(numberOfLines);
    }

    public static void drawTriangle(int numberOfLines){
        for (int i = 1; i <= numberOfLines; i += 2) {
            whiteSpaceSingleLine(numberOfLines / 2 - (i / 2));
            starSingleLine(i);
            System.out.print("\n");
        }
    }
    public static void drawSquare(int numberOfLines){
        for (int i = 1; i < numberOfLines / 6; i++) {
            whiteSpaceSingleLine(numberOfLines / 3);
            starSingleLine(numberOfLines / 3 + 1);
            System.out.print("\n");
        }
    }

    public static void starSingleLine(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    public static void whiteSpaceSingleLine(int whitespaces) {
        for (int i = 0; i < whitespaces; i++) {
            System.out.print(" ");
        }
    }
}
