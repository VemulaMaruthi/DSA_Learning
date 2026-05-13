package Arrays.TwoPointers;

public class ReverseString {
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
       reverse(s);
    }
    public static void reverse (char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (char word : s) {
            System.out.print(word+" ");
        }
    }
}
