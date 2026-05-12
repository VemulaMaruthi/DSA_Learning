package Patterns;

import java.util.Scanner;

public class PatternEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int rows = sc.nextInt();
        int start ;
        for (int i = 0; i < rows; i++) {
          if(i%2 == 0) start = 1;
          else start = 0;
          for (int j = 0; j <= i ; j++) {
              System.out.print(start);
              start = 1-start;
          }
            System.out.println();
        }
        sc.close();
    }
}
