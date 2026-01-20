import java.util.*;

public class Chemistry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();

      int[] str = new int[26];
      for (char ch : s.toCharArray()) {
        str[ch - 'a']++;
      }

      int i = 0, odd = 0;
      while (i < 26) {
        if (str[i] % 2 == 1) {
          odd++;
        }

        i++;
      }

      if (odd > k + 1)
        System.out.println("No");
      else
        System.out.println("Yes");

    }

    sc.close();
  }
}