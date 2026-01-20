import java.util.*;

public class We_Need_the_Zero {
  public static int solve(int n, Scanner sc) {
    int ans = 0;
    for(int i=0;i<n;i++){
      int x = sc.nextInt();
      ans = x ^ ans;
    }

    if(n%2 != 0){
      return ans;
    }else if(ans == 0){
      return 0;
    }else return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      
      System.out.print(solve(n, sc));
      System.out.println();
    }
    sc.close();
  }
}
