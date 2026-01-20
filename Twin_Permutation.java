import java.util.*;

public class Twin_Permutation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Length of the line
    while (t-- > 0) {
      int n = sc.nextInt(); // Position of the grasshopper
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); // Read each element of the sequence
      }
      int[] ans = new int[n];
      for(int i=0;i<n;i++){
        ans[i] = n - arr[i]+1;
        System.out.print(ans[i] + " ");
      }
      System.out.println();
  
    }
    sc.close();
  }
}
