import java.util.*;

public class Odd_Queries {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int q = sc.nextInt();
      long[] a = new long[n+1];
      long[] prefix = new long[n+1];
      for (int i = 1; i <= n; i++){
        a[i] = sc.nextLong();
        prefix[i] = prefix[i-1] + a[i];
      }

      long total = prefix[n];

      while (q-- > 0) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();

        long oldSum = prefix[r] - prefix[l-1];
        long newSum = (long)(r-l+1)*k;
        long newTotal = total - oldSum + newSum;
        if (newTotal % 2 == 1)
          System.out.println("Yes");
        else
          System.out.println("No");
      }
    }

    sc.close();
  }
}