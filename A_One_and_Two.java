import java.util.*;

public class A_One_and_Two {
  
  public static int solve(int[] arr, int n, int twos) {
    int x= 0;
    for(int i=0;i<n;i++){
      if(arr[i] == 2){
        x++; twos--;
      }
      if(x==twos) return i+1;
    }
    return -1;    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      int twos=0;
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        if(a[i]==2) twos++;
      }
      System.out.println(solve(a,n,twos));
    }
    sc.close();
  }
}
