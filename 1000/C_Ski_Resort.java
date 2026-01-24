import java.util.*;

public class C_Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            long count=0;
            long ans=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
              if(arr[i]<=q){
                count++;
                flag=true;
              }else{

                if(count>=k) 
                  ans= ans + ((long)(count-k+1)* (count-k+2)/2);
                flag=false;
                count=0;
              }
            }
            if(flag==true && count>=k){
              ans = ans + ((long)(count-k+1)* (count-k+2)/2);
            }
            System.out.println(ans);
            
        }
        sc.close();
    }
}