public class TWOSUM {
    public static int[] twoSum(int[] nums, int target) {
        int ar[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ar[0] = i;
                    ar[1] = j;
                    return ar; // return immediately when found
                }
            }
        }

        return ar; // default (if not found)
    }

    

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int result[] = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

