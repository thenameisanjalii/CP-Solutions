import java.util.*;

public class D_Distinct_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n=sc.nextInt();
            String s=sc.next();
            Set<Character> st=new HashSet<>();
            int[] pre= new int[n+1];
            int[] suf= new int[n+1];
            
            for(int i=1;i<=n;i++){
              st.add(s.charAt(i-1));
              pre[i]=st.size();
            }

            st.clear();
            for(int i=n;i>=1;i--){
              st.add(s.charAt(i-1));
              suf[i]=st.size();
            }

            long ans=0;
            for(int i=0;i<n;i++){
              ans=Math.max(ans, pre[i]+suf[i+1]);
            }
            System.out.println(ans);

        }
        sc.close();
    }
}