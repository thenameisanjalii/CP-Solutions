import java.util.*;

public class DontTryToCount {
  public static void main(String[] args) {
    // This is a simple Java program that does not count anything.
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      String x = sc.next();
      String s = sc.next();
      int cnt = 0;
      while (x.length() < s.length()) {
        x = x + x;
        cnt++;
      }
      if (!checkSubstring(x, s)) {
        x = x + x;
        cnt++;
        if (!checkSubstring(x, s)) {
          System.out.println("-1");
          continue;
        }
      }
      System.out.println(cnt);
    }
    sc.close();
  }

  public static boolean checkSubstring(String x, String s) {
    for (int i = 0; i <= x.length() - s.length(); i++) {
      if (x.substring(i, i + s.length()).equals(s)) {
        return true;
      }
    }
    return false;
  }
}