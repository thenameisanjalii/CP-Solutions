import java.util.*;

public class Walking_Master {
  public static int solve(int a, int b, int c, int d){
    if(b>d) return -1;
    int up = d-b;
    int new_a = a + up;

    if(new_a<c) return -1;
    int left = new_a - c;
    return up+left;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();

      System.out.print(solve(a,b,c,d));
      System.out.println();
    }
    sc.close();
  }
}
