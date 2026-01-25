import java.util.*;

public class B_Luke_is_a_Foodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            int[] arr = new int[(int)n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            long mini=Long.MAX_VALUE;
            long maxi=Long.MIN_VALUE;

            int i=0,j=0;
            int cnt=0;
            long doub=2*(long) x;
            while(i<n && j<n){
              mini=Math.min(mini, arr[j]);
              maxi=Math.max(maxi, arr[j]);
              if((maxi-mini)> doub){
                cnt++;
                i=j;
                mini=arr[j];
                maxi=arr[j];
              }else j++;

            }
            System.out.println(cnt);
            
        }
        sc.close();
    }
}