import java.util.*;

public class B_Array_merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            int cnt=1;
            int[] ha=new int[2*n+1];
            int[] hb=new int[2*n+1];
            for(int i=1;i<=n;i++){
              if(i==n || a[i-1]!=a[i]){
                int val=a[i-1];
                if(cnt>ha[val]){
                  ha[val]=cnt;
                }
                cnt=1;
              }
              else cnt++;
            }

            cnt=1;

            for(int j=1;j<=n;j++){
              if(j==n || b[j-1]!=b[j]){
                int val=b[j-1];
                if(cnt>hb[val]){
                  hb[val]=cnt;
                }
                cnt=1;
              }
              else cnt++;
            }

            int maxi=0;
            
            for(int i=0;i<=2*n;i++){
              maxi=Math.max(maxi, ha[i]+hb[i]);
            }
          if(n==0) System.out.println(0);
          else System.out.println(maxi);
            
        }
        sc.close();
    }
}