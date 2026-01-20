import java.util.*;

public class Make_It_Increasing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt(); // Number of test cases

    while (tc-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      int cnt = 0;
      boolean possible = true;

      for (int i = n - 1; i > 0; i--) {
        while (a[i - 1] >= a[i]) {
          if (a[i - 1] == 0) {
            possible = false;
            break;
          }
          a[i - 1] /= 2;
          cnt++;
        }
        if (!possible) break;
      }

      System.out.println(possible ? cnt : -1);
    }

    sc.close();
  }
}
