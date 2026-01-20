import java.util.*;

public class Forked{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
      int a= sc.nextInt();
      int b= sc.nextInt();
      int xk = sc.nextInt();
      int yk = sc.nextInt();
      int xq = sc.nextInt();
      int yq = sc.nextInt();

      Set<String> s = new HashSet<>();
      Set<String> t = new HashSet<>();

      int[] dirs = {a, -a};

      for(int dx : dirs){
        for(int dy: new int[]{b, -b}){
          s.add((xk + dx) + "," + (yk + dy));
          s.add((xk + dy) + "," + (yk + dx));
          t.add((xq + dx) + "," + (yq + dy));
          t.add((xq + dy) + "," + (yq + dx));
        }
      }

      int ans = 0;
      for(String pos: s){
        if(t.contains(pos)){
          ans++;
        }
      }
      System.out.println(ans);
    }
    
    
    sc.close();
  }
}