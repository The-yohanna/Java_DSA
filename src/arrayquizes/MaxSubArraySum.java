package arrayquizes;

import java.util.Arrays;

public class MaxSubArraySum {
    public static int maxSubarray(int[] nums) {
        // Check if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Initialize the maximum sum and current sum with the first element
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Loop through the rest of the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current sum to be the larger between the current number
            // and the current sum added with the current number
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum to be the larger between the old maximum sum
            // and the updated current sum
            maxSum = Math.max(maxSum, currentSum);
        }

        // After the loop, return the maximum sum found
        return maxSum;
    }



    public static void main(String[] args) {
        // Example 1: Simple case with positive and negative numbers
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);

        // Example 2: Case with a negative number in the middle
        int[] inputCase2 = {1, 2, 3, -4, 5, 6};
        int result2 = maxSubarray(inputCase2);
        System.out.println("Example 2: Input: " + Arrays.toString(inputCase2) + "\nResult: " + result2);

        // Example 3: Case with all negative numbers
        int[] inputCase3 = {-1, -2, -3, -4, -5};
        int result3 = maxSubarray(inputCase3);
        System.out.println("Example 3: Input: " + Arrays.toString(inputCase3) + "\nResult: " + result3);

        // Example 4: Case with all positive numbers
        int[] inputCase4 = {1, 2, 3, 4, 5};
        int result4 = maxSubarray(inputCase4);
        System.out.println("Example 4: Input: " + Arrays.toString(inputCase4) + "\nResult: " + result4);

        // Example 5: Case with alternating positive and negative numbers
        int[] inputCase5 = {1, -1, 1, -1, 1};
        int result5 = maxSubarray(inputCase5);
        System.out.println("Example 5: Input: " + Arrays.toString(inputCase5) + "\nResult: " + result5);

    }
}
