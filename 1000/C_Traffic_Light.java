import java.util.*;

public class C_Traffic_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n=sc.nextInt();
            char c=sc.next().charAt(0);
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s+s);
            if(c=='g'){
              System.out.println(0);
              continue;
            }
            int i=0,j=1;
            int ans=0;
            while(i<(2*n) &&j<(2*n)){
              if(sb.charAt(i)==c){
                while(j<2*n && sb.charAt(j)!='g'){
                  j++;
                }

                ans=Math.max(ans,j-i);
                i=j+1;
                j=i+1;
                // continue;
              }else{
                i++;
                j=i+1;
              } 
            }
            // System.out.println(sb);
            System.out.println(ans);
        }
        sc.close();
    }
}