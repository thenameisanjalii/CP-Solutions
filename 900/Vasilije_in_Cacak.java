import java.util.*;

public class Vasilije_in_Cacak {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      long n = sc.nextLong();
      long k = sc.nextLong();
      long x = sc.nextLong();

      long mini = (k*(k+1))/2;
      long maxi = (k*(2*n+1-k))/2;
      if(x>=mini && x<=maxi) System.out.println("Yes");
      else System.out.println("No");
    }

    sc.close();
  }
}