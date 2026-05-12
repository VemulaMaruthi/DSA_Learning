package Patterns;

import java.util.Scanner;

public class PatternTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows = ");
        int rows = sc.nextInt();
        int spaces = 2 * (rows - 1);


        for (int i = 1; i <= rows; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }


            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }


            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }


            System.out.println();


            spaces -= 2;
        }
        sc.close();
    }
}
