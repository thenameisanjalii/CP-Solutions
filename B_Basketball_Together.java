import java.util.*;

public class B_Basketball_Together {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }

        Arrays.sort(a);

        int l=0,r=n-1;
        int wins=0;

        while(l<=r){
          int max=a[r];
          long need=(d/max)+1;
          if(r-l>=need-1){
            wins++;
            l+=(need-1);
            r--;
          }else break;
        }

        System.out.println(wins);
        sc.close();
    }
}