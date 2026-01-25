import java.util.*;

public class B_Shoe_Shuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            int i=0,j=i+1;
            int[] ans=new int[n];
            boolean flag=false;

            while(i<n){
              int start=a[i];
              j=i+1;
              while(j<n && a[j]==start){
                j++;
              }
              if(j==i+1){
                flag=true;
                break;
              }
              rotate(a,i, j-1, ans);
              i=j;
            }
            if(flag==true){
              System.out.println(-1);
              continue;
            }
            for(i=0;i<n;i++){
              System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void rotate(int[] a, int l,int r, int[] ans){
      ans[l]=r+1;
      for(int k=l+1;k<=r;k++){
        ans[k]=k;
      }
    }
}