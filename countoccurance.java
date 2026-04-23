

public class countoccurance {
  public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
    int[] ans = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      int count = 0;
      int index = -1;

      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == x) {
          count++;
          if (count == queries[i]) {
            index = j;
            break;
          }
        }
      }

      ans[i] = index;
    }

    return ans;
  }
}
