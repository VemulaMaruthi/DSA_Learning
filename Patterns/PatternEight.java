package Patterns;

import java.util.Scanner;

public class PatternEight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int rows = sc.nextInt();
        for (int i = rows-1; i >= 0; i--) {
            for (int j = rows-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i+1; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = rows-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
