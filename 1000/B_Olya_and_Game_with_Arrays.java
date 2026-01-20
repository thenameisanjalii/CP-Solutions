import java.util.*;

public class B_Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] mini=new int[n];
            int[] sec_mini=new int[n];
            Arrays.fill(mini, Integer.MAX_VALUE);
            Arrays.fill(sec_mini, Integer.MAX_VALUE);

            for (int k = 0; k < n; k++){
                int m=sc.nextInt();
                int[] arr = new int[m];
                for(int i=0;i<m;i++){
                  arr[i]=sc.nextInt();
                  if(arr[i]<mini[k]){
                    sec_mini[k]=mini[k];
                    mini[k]=arr[i];
                  }
                  else if(arr[i]<sec_mini[k]){
                    sec_mini[k]=arr[i];
                  }
                }
              }

              Arrays.sort(mini);
              Arrays.sort(sec_mini);
              long sum=0;
              for(int i=0;i<n;i++){
                sum+=sec_mini[i];
              }
              sum-=sec_mini[0];
              sum+=mini[0];
              System.out.println(sum);
            
        }
        sc.close();
    }
}