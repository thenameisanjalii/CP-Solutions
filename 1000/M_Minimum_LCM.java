import java.util.*;

public class M_Minimum_LCM {
    public static long lcm(int a,int b){
      return (long)a*b / gcd(a,b);
    }
    public static int gcd(int a, int b){
      if(b==0) return a;
      return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n=sc.nextInt();
            long a=1, b=n-1;
            for(long fac=2;fac*fac<=n;fac++){
              if(n%fac==0){
                a=n/fac;
                b=n-a;
                break;
              }
            }
            System.out.println(a + " " + b);
        }
        sc.close();
    }
}