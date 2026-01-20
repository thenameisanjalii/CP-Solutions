import java.util.*;

public class Array_Cloning_Technique {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt(); // Number of test cases

    while (tc-- > 0) {
      int n= sc.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++) a[i] = sc.nextInt();

      if(n==1){
        System.out.println(0);
        continue;
      }

      int maxi = Integer.MIN_VALUE;
      Map<Integer, Integer> mpp = new HashMap<>();
      for(int i=0;i<n;i++){
        mpp.put(a[i], mpp.getOrDefault(a[i], 0) + 1);
        maxi = Math.max(maxi, mpp.get(a[i]));
      }

      int op=0;
      while(maxi<n){
        if((maxi*2)<n){
          op+=maxi+1;
          maxi = maxi*2;
        } 
        else{
          op+= n-maxi+1;
          break;
        }
      }
      System.out.println(op);
    }

    sc.close();
  }
}
