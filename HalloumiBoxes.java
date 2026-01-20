import java.util.*;

public class HalloumiBoxes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Number of test cases
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      if (k == 1) {
        if (isSorted(arr)) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      } else {
        System.out.println("YES");
      }
    }
    sc.close();
  }

  public static boolean isSorted(int[] a) {
    for (int i = 1; i < a.length; i++) {
      if (a[i] < a[i - 1])
        return false;
    }
    return true;
  }
}