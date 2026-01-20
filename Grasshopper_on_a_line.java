import java.util.*;

public class Grasshopper_on_a_line {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Length of the line
    while (t-- > 0) {
      int x = sc.nextInt(); // Position of the grasshopper
      int k = sc.nextInt(); // Number of jumps
      List<Integer> ls = new ArrayList<>();

      int rem = x % k;
      if (rem != 0) {
        System.out.println(1);
        System.out.println(x);
        continue;
      }

      for (int i = x - 1; i > 0; i--) {
        rem = i%k;
        if (rem == 0)
          continue;
        System.out.println(2);
        System.out.print(i + " ");
        System.out.println(x-i);
        break;

      }
    }
    sc.close();
  }
}
