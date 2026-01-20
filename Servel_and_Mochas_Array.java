import java.util.*;

public class Servel_and_Mochas_Array {
  public static int gcd(int a, int b){
    while(b!=0){
      int temp = b;
      b = a%b;
      a = temp;
    }
    return a;
  }
  public static boolean solve(int[] arr, int n) {
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(gcd(arr[i], arr[j])<=2) return true;
      }
    }
    return false;
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      if(solve(a,n)) System.out.println("Yes");
      else System.out.println("No");
    }
    sc.close();
  }
}
