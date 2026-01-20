import java.util.*;

public class A_Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long gap=Math.abs(a-b);
            if(gap==0){
              System.out.println("0 0");
              continue;
            }
            long rem=Math.max(a,b)%gap;
            long minus=gap-rem;
            System.out.println(gap + " " + Math.min(rem,minus));
        }
        sc.close();
    }
}