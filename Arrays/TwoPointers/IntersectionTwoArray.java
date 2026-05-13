package Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArray {
    public static void main(String[] args) {
     int[] num1 = {1,2,2,1};
     int[] num2 = {2,2};
        System.out.println(Arrays.toString(intersect(num1,num2)));
    }
    public static int[] intersect(int[] num1, int[] num2) {
       int i =0;
       int j = 0;
       int k = 0;
        Arrays.sort(num1);
        Arrays.sort(num2);
       while (i < num1.length && j < num2.length) {
           if (num1[i] < num2[j]) {
               i++;
           }else if (num1[i] > num2[j]) {
               j++;
           }else {
               num1[k] = num1[i];
               k++;
               i++;
               j++;
           }
       }
       return Arrays.copyOfRange(num1,0,k);
    }
}
