import java.util.*;

public class Prepend_and_Append {
  public static int solve(char[] arr, int n) {
    int i=0, j=n-1, len = n;
    while(i<j){
      if(arr[i]!=arr[j]){
        len-=2;
        i++; j--;
      }else break;
    }
    return len;
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      char[] arr = s.toCharArray();
      
      System.out.print(solve(arr, n));
      System.out.println();
    }
    sc.close();
  }
}
