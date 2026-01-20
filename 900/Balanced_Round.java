import java.util.*;

public class Balanced_Round {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
      int n= sc.nextInt();
      int k= sc.nextInt();
      int[] a = new int[n];
      for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
      }
      
    

      int count=1, maxi=1;

      Arrays.sort(a);
      for(int i=0;i<n-1;i++){
        if(a[i+1]-a[i] <=k){
          count++;
        }else count=1;
        maxi = Math.max(count, maxi);
      }

      System.out.println(n-maxi);
    }
    
    
    sc.close();
  }
}