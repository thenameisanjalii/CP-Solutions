import java.util.*;

public class Not_Dividing {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      // Handle the case where a[0] is 1
      if (a[0] == 1) {
        a[0]++; // change 1 to 2
      }
      for(int i=1;i<n;i++){
        // First ensure current element is not 1
        if (a[i] == 1) {
          a[i]++;
        }
        // Then check divisibility
        while(a[i]%a[i-1] == 0){
          a[i]++;
        }
      }
      for(int i=0;i<n;i++){
        System.out.print(a[i] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}