import java.util.*;

public class CoverInWater {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt(); // Number of test cases

    for (int j = 0; j < t; j++) {
      int n = sc.nextInt(); // Number of cells
      sc.nextLine(); // Consume the newline after the integer
      String s = sc.nextLine(); // String representing the cells

      System.out.println(calculateMinWater(n, s));
    }
    sc.close();
  }

  private static int calculateMinWater(int n, String s) {
    int block = 0; // A flag to indicate whether the previous cell was blocked (#).
    int con = 0; // A counter to track the number of consecutive empty cells (.).
    int cnt = 0; // The total number of Action 1 operations required.

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '#') {
        block = 1;
        con = 0;
      } else if (s.charAt(i) == '.') {
        if (block == 1 || cnt == 0) {
          con++;
          cnt++;
          block = 0;
        } else if (block == 0) {
          if (con < 2) {
            cnt++;
          } else {
            cnt = 2;
            break;
          }
          con++;
        }
      }
    }
    return cnt;
  }
}