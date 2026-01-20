import java.util.*;

public class A_Strange_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            long sum=0, mod_sum=0;
            int flag=0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i]%x!=0) flag=1;
                sum+=arr[i];
                mod_sum+=Math.ceil(arr[i] * 1.0/x);
            }
            long min=(long)Math.ceil(sum*1.0/x);
            System.out.println(min + " " + (mod_sum));
            
            
        }
        sc.close();
    }
}