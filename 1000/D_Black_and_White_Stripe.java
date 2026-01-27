import java.util.*;

public class D_Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            
            int cnt=0;
            int mini=Integer.MAX_VALUE;
            int i=0,j=0;
            while(j<n){
              if(s.charAt(j)=='W'){
                cnt++;
              }
              if(j-i+1==k){
                mini=Integer.min(mini, cnt);
                if(s.charAt(i)=='W'){
                  cnt--;
                }
                i++;
              }
              j++;
            }
            System.out.println(mini);
        }
        sc.close();
    }
}