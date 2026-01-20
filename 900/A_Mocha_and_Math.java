import java.util.*;

public class A_Mocha_and_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            long total_and=arr[0];
            for(long i=1;i<n;i++){
              total_and &=arr[(int)i];
            }
            System.out.println(total_and);
            
        }
        sc.close();
    }
}