import java.util.*;

public class LineTrip {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    while (T-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] arr = new int[n];

      for (int j = 0; j < n; j++) {
        arr[j] = sc.nextInt();
      }

      System.out.println(calculateMinTankSize(n, x, arr));
    }
    sc.close();
  }

  private static int calculateMinTankSize(int n, int x, int[] arr) {
    int firstSegment = arr[0];

    int maxGap = 0;
    for (int i = 1; i < n; i++) {
      maxGap = Math.max(maxGap, arr[i] - arr[i - 1]);
    }

    int roundTripLastSegment = 2 * (x - arr[n - 1]);

    return Math.max(firstSegment, Math.max(maxGap, roundTripLastSegment));
  }
}