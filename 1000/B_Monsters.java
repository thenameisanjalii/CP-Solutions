import java.util.*;

public class B_Monsters {
  static class Pair {
    int first, second;

    Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      List<Pair> ls = new ArrayList<>();
      for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        int rem=arr[i]%k;
        if(rem==0) rem=k;
        ls.add(new Pair(i+1, rem));
      }
      Collections.sort(ls, (a,b) -> b.second - a.second);
      for(Pair p : ls){
        System.out.print(p.first + " ");
      }
      System.out.println();
        

    }
    sc.close();
  }
}