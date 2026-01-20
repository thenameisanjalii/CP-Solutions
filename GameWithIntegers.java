import java.util.*;

public class GameWithIntegers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    while(T-- > 0) {
      int n = sc.nextInt();

      System.out.println(calculateWins(n));
    }
    sc.close();
  }

  private static String calculateWins(int n) {
    if (n % 3 == 0)
      return "Second";
    else
      return "First";
  }
}
