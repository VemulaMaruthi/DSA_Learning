package Arrays.TwoPointers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        if(isPalindrome(str)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public static boolean isPalindrome (String s) {
      s = s.toLowerCase().replaceAll("[^a-z0-9]","");
      int left = 0;
      int right = s.length()-1;

      while(left < right) {
          if (s.charAt(left) != s.charAt(right)) {
              return false;
          }
          left++;
          right--;
      }
      return true;
    }
}
