package Arrays.TwoPointers;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
     int n = 19;
     if (isHappy(n)) {
         System.out.println("True");
     }else {
         System.out.println("False");
     }
    }
    public static boolean isHappy (int n) {
        Set<Integer> set = new HashSet<>();

        while(!set.contains(n)) {
            set.add(n);
            n = getNextNumber(n);
            if(n == 1) {
                return true;
            }
        }
        return false;
    }
    public static int getNextNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }
}
