import java.util.*;

public class B_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n=sc.nextInt();

            long c3=0,c2=0;

            while(n>0 && n%3==0){
              c3++;
              n/=3;
            }

            while(n>0 && n%2==0){
              c2++;
              n/=2;
            }

            if(n>1 || c2 > c3) System.out.println("-1");
            else System.out.println(c3 + (c3-c2));
            
        }
        sc.close();
    }
}