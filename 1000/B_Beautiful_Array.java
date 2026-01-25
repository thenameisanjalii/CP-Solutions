import java.util.*;

public class B_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long b=sc.nextLong();
            long s=sc.nextLong();

            long max=k*b + n*(k-1);
            long min=k*b;

            if(s<min || s>max){
              System.out.println(-1);
              continue;
            }
            
            long[] ans=new long[(int)n];
            ans[0]=k*b;
            long req=s-(k*b);

            for(int i=0;i<n;i++){
              long add=Math.min(req,k-1);
              ans[i]+=add;
              req-=add;
            }
            for(int i=0;i<n;i++){
              System.out.print(ans[i] + "  ");
            }
            System.out.println();
              
        }
        sc.close();
    }
}