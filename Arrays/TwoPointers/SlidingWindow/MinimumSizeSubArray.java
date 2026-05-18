package Arrays.TwoPointers.SlidingWindow;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
          int max = Integer.MAX_VALUE;
          int sum = 0;
          int left = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                if (i-left+1<max) {
                    max = i-left+1;
                }
                sum -= nums[left];
                left++;
            }
        }
        return max != Integer.MAX_VALUE ? max:0;
    }
}
