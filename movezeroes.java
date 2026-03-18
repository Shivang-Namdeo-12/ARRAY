

public class movezeroes {

    public void moveZeroes(int[] nums) {
        int rd = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[rd] = nums[i];
                rd++;
            }
        }

        // Fill remaining with zeros
        while (rd < nums.length) {
            nums[rd] = 0;
            rd++;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int nums[] = {0, 1, 0, 3, 12};

        obj.moveZeroes(nums);

        // Print updated array
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
} 