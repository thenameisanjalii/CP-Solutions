import java.util.*;

public class A_Three_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int maxi=Integer.MIN_VALUE;
            int ind=-1;
            for (int i = 0; i < n; i++){
              arr[i] = sc.nextInt();
            }
            if(n<3){
              System.out.println("NO");
              continue;
            }
            for(int i=1;i<n-1;i++){
              if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                ind=i;
              }
            }
            if(ind!=-1){
              System.out.println("YES");
              System.out.println((ind)+" "+(ind+1)+" "+(ind+2));
            }else System.out.println("NO");           
        }
        sc.close();
    }
}