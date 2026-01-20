import java.util.*;

public class JaggedSwaps {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    while (T-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      System.out.println(calculate(n, arr));
    }
    sc.close();
  }

  private static String calculate(int n, int[] arr) {
    boolean isSorted = true;
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) {
        isSorted = false;
        break;
      }
    }

    if (isSorted)
      return "YES";
    else if (arr[0] == 1) // Possible for Sorting
      return "YES";
    else
      return "NO";
  }
}
