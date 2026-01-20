import java.util.*;

public class United_We_Stand {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int flag = 0;
      for(int i=1;i<n;i++){
        if(a[i-1] != a[i]){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        System.out.println(-1);
        continue;
      } 

      Arrays.sort(a);

      ArrayList<Integer> b = new ArrayList<>();
      ArrayList<Integer> c = new ArrayList<>();
      
      b.add(a[0]);
      for(int i=1;i<n;i++){
        if(a[i]==a[0]) b.add(a[i]);
        else c.add(a[i]);
      }

      System.out.println(b.size() + " " + c.size());
      for(int x : b) System.out.print(x + " ");
      System.out.println();
      for(int x : c) System.out.print(x + " ");
      System.out.println();
      
    }
    sc.close();
  }
}
