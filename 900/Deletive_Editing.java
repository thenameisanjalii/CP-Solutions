import java.util.*;

public class Deletive_Editing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt(); // Number of test cases

    while (tc-- > 0) {
      String s = sc.next();
      String t = sc.next();
      int m=s.length(), n=t.length();
      int i=m-1, j=n-1;
      Map<Character, Integer> mpp = new HashMap<>();
      for(char ch: t.toCharArray()){
        mpp.put(ch, mpp.getOrDefault(ch, 0) +1);
      } 

      while(i>=0 && j>=0){
        if(s.charAt(i) == t.charAt(j)){
          mpp.put(t.charAt(j), mpp.get(t.charAt(j)) - 1);
          if(mpp.get(t.charAt(j))==0) mpp.remove(t.charAt(j));
          j--;
        }else if(mpp.containsKey(s.charAt(i))){
          System.out.println("No");
          break;
        }
        i--;
      }
      if(i<0 && j>=0){
        System.out.println("No");
      }else if(j<=0){
        System.out.println("Yes");
      }
    }

    sc.close();
  }
}
