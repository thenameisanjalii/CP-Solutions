import java.util.*;

public class JellyFish_and_UnderTale {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();
      int[] x = new int[n];

      long sum=0, count=0;
      for (int i = 0; i < n; i++) {
        x[i] = sc.nextInt();
        if(a<=x[i]) count++;
        else sum+=x[i];
      }
      System.out.println(sum + b + (count * (a-1)));
    }

    sc.close();
  }
}