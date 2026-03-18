//LEETCODE 53

public class maxsuubarrausum {

    public static void maxSubarraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        maxSubarraySum(nums);
    }
}