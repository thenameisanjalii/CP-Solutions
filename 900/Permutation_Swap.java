import java.util.*;

public class Permutation_Swap {
  public static int gcd(int a, int b){
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
      int n= sc.nextInt();
      int[] arr  = new int[n];
      for(int i=0;i<n;i++) arr[i] = sc.nextInt();

      int ans=0, x;
      for(int i=0;i<n;i++){
        if(arr[i]==i+1) continue;
        x = Math.abs(arr[i]-(i+1));
        ans = gcd(x,ans);
      }
      System.out.println(ans);
    }
    
    
    sc.close();
  }
}