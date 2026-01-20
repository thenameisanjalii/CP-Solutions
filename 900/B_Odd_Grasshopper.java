import java.util.*;
import java.lang.*;

public class B_Odd_Grasshopper {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0) {
      long x = sc.nextLong();
      long n = sc.nextLong();
      if(n%4==0){
        System.out.println(x+0);
      }else if(n%4==1){
        if(x%2==0) System.out.println(x-n);
        else System.out.println(x+n);
      }else if(n%4==2){
        if(x%2==0) System.out.println(x+1);
        else System.out.println(x-1);
      }else{
        if(x%2==0) System.out.println(x+n+1);
        else System.out.println(x-(n+1));
      }
    }
    sc.close();
  }
}
