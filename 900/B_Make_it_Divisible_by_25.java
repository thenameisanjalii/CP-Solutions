import java.util.*;

public class B_Make_it_Divisible_by_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String n=sc.next();
            System.out.println(solve(n));
        }
        sc.close();
    }
    public static int solve(String s){
      int n=s.length();
      int minSteps=n;

      String[] targets = {"00", "25", "50", "75"};

      for(String target:targets){
        char d1=target.charAt(0);
        char d2=target.charAt(1);

        int j=-1;
        for(int k=n-1;k>=0;k--){
          if(s.charAt(k)==d2){
            j=k;
            break;
          }
        }
        if(j==-1) continue;

        int i=-1;
        for(int k=j-1;k>=0;k--){
          if(s.charAt(k)==d1){
            i=k;
            break;
          }
        }
        if(i==-1) continue;

        int steps=(n-1-j)+(j-1-i);
        minSteps=Math.min(minSteps, steps);
      }
      return minSteps;
    }
}