import java.util.*;

public class Make_it_Beautiful{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      int flag = 0, prev = 0;
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }

      if(a[0] == a[n-1]) System.out.println("No");
      else{
        System.out.println("Yes");
        System.out.print(a[n-1] + " ");
        for(int i=0;i<n-1;i++) System.out.print(a[i] + " ");
      }
      System.out.println();
      
    }
    sc.close();
  }
}
