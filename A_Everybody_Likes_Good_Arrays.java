import java.util.*;

public class A_Everybody_Likes_Good_Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      int flag = 0, prev = 0;
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        a[i]%=2;
      }
      int op =0, streak=1;
      for(int i=0;i<n-1;i++){
        if(a[i] == a[i+1]){
          streak++;
        }else{
          op+=streak-1;
          streak=1;
        }
      }
      op+=streak-1;
      System.out.println(op);
      
    }
    sc.close();
  }
}
