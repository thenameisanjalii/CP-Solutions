import java.util.*;

public class A_Helmets_in_Night_Light {
    static class Pair{
      long cost;
      long share;
      Pair(long cost, long share){
        this.cost=cost;
        this.share=share;
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int p=sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();
            List<Pair> v= new ArrayList<>();
            for(int i=0;i<n;i++){
              v.add(new Pair(b[i], a[i]));
            }         
            
            Collections.sort(v, (p1,p2)-> Long.compare(p1.cost, p2.cost));

            long minCost=p;
            long alreadyShared=1;

            for(Pair pair:v){
              long canBeShared=pair.share;
              long sharingCost=pair.cost;

              if(sharingCost>=p) break;

              if(alreadyShared + canBeShared > n){
                minCost+=(n-alreadyShared)*sharingCost;
                alreadyShared=n;
                break;
              }else{
                minCost+=canBeShared*sharingCost;
                alreadyShared+=canBeShared;
              }
            }

            minCost+=(n-alreadyShared)*p;
            System.out.println(minCost);
            
        }
        sc.close();
    }
}