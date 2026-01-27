import java.util.*;

public class A_Red_Versus_Blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            int extra=r%(b+1);
            int baseR=r/(b+1);

            for(int i=0;i<(b+1);i++){
              for(int j=0;j<baseR;j++) sb.append('R');
              if(extra>0){
                sb.append('R');
                extra--;
              }
              if(i<b) sb.append('B');

            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}