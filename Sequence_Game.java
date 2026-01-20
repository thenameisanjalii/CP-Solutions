import java.util.*;

public class Sequence_Game {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // Number of test cases
    while (T-- > 0) {
      int n = sc.nextInt(); // Length of the sequence
      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
        b[i] = sc.nextInt(); // Read each element of the sequence
      }

      // Calculate the minimum absolute value in the array
      ArrayList<Integer> a = new ArrayList<>();
      a.add(b[0]);
      for (int i = 1; i < n; i++) {
        if (b[i] < b[i - 1]) {
          if (b[i] - 1 == 0) {
            a.add(1);
          } else {
            a.add(b[i] - 1);
          }
        }
        a.add(b[i]);
      }

      System.out.println(a.size());
      for (int num : a) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
