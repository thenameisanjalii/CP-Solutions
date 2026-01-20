import java.util.Scanner;
public class GoalsofVictory {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    while (T-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      int sum=0;

      for (int i = 0; i < n-1; i++) {
        arr[i] = sc.nextInt();
        sum+=arr[i];
      }
      System.out.println(-sum);

    }
    sc.close();
  }
}
