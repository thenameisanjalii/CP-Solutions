import java.util.*;
public class Desorting{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int flag=0;
      for(int i=1;i<n;i++){
        if(arr[i-1]>arr[i]){
          flag=1;
          break;
        }
      }

      if(flag==1){
        System.out.println(0);
        continue;
      } 
      
      int mini= Integer.MAX_VALUE;
      for(int i=1;i<n;i++){
        mini =Math.min(mini, Math.abs(arr[i]-arr[i-1]));
      }

      System.out.println(mini/2+1);
    }
    sc.close();
  }
}