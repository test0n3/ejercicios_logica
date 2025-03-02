import java.util.Map;
import java.util.HashMap;

class TwoSum2 {
  public static void main(String[] args) {
    System.out.println(printArr(twoSum2(new int[] { 2, 7, 11, 15 }, 9)));
    System.out.println(printArr(twoSum2(new int[] { 2, 3, 4 }, 6)));
    System.out.println(printArr(twoSum2(new int[] { -1, 0 }, -1)));
  }

  public static int[] twoSum2(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;
    int[] resp = null;
    while (true) {
      int sum = numbers[start] + numbers[end];
      if (sum < target) {
        start++;
      }

      if (sum > target) {
        end--;
      }

      if (sum == target) {
        resp = new int[] { start + 1, end + 1 };
        break;
      }

      if (start == end) {
        break; 
      }
    }
    return resp;
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
