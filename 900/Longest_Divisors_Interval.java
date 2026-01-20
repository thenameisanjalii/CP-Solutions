import java.util.*;

public class Longest_Divisors_Interval {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      long n = sc.nextLong();
      
      long i=1;
      for(i=1;i<=n;i++){
        if(n%i!=0) break;
      }
      System.out.println(i-1);
    }

    sc.close();
  }
}