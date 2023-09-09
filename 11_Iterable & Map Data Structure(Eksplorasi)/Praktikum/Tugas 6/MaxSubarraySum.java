public class MaxSubarraySum {
    public static int findMaxSumSubarray(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Menghitung sum pertama subarray berukuran k
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Geser jendela untuk menghitung sum maksimum subarray
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] input1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = findMaxSumSubarray(input1, k1);
        System.out.println(maxSum1); // Output: 9

        int[] input2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = findMaxSumSubarray(input2, k2);
        System.out.println(maxSum2); // Output: 7
    }
}
