import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public static void main(String[] args) {
    System.out.println(printArr(twoSum2(new int[] { 2, 7, 11, 15 }, 9))); // 0, 1
    System.out.println(printArr(twoSum2(new int[] { 3, 2, 4 }, 6))); // 1, 2
    System.out.println(printArr(twoSum2(new int[] { 3, 3 }, 6))); // 0, 1
  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      int missing = target - nums[i];
      for (int j = i + 1; j <= nums.length - 1; j++) {
        if (nums[j] == missing) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }

  public static int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (map.containsKey(target - num)) {
        return new int[] { map.get(target - num), i };
      }
      map.put(num, i);
    }
    return new int[] {};
  }

  public static String printArr(int[] arr) {
    String resp = "";
    resp += "[";
    for (int i = 0; i < arr.length; i++) {
      resp += arr[i];
      if (i != arr.length - 1) {
        resp += ", ";
      }
    }
    resp += "]";
    return resp;
  }
}
