import java.util.*;

public class Coins {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long k = sc.nextLong();

      if (k % 2 == 0) {
        // k is even, so we can only make even sums
        if (n % 2 == 0) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      } else {
        // k is odd, we can make any n >= k using y=1 and x=(n-k)/2
        // or any even n using only denomination 2 coins
        if (n % 2 == 0 || n >= k) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      }
    }
    sc.close();
  }
}
