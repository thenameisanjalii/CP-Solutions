import java.util.*;

public class B_Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s=sc.next();
            int n=s.length();
            int zeroes=0,ones=0;
            for(int i=0;i<n;i++){
              if(s.charAt(i)=='0') zeroes++;
              else ones++;
            }
            int i=0;
            for(i=0;i<n;i++){
              if(s.charAt(i)=='0'){
                if(ones>0) ones--;
                else break;
              }else{
                if(zeroes>0) zeroes--;
                else break;
              }
            }
            System.out.println(n-i);
        }
        sc.close();
    }
}