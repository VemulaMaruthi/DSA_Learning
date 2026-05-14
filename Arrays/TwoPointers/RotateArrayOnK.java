package Arrays.TwoPointers;

public class RotateArrayOnK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
       rotate(arr,k);
    }
    public static void rotate(int[] arr, int k) {
        k = k%arr.length;
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
    public static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
