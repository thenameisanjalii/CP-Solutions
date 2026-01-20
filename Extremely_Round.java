import java.util.*;

public class Extremely_Round {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = n;
      int digit=0, store=0;
      while(x>0){
        if(x<10){
          store=x;
        }
        x= x/10;
        digit++;
      }
      System.out.println(store + (9)*(digit-1));
      
    }
    sc.close();
  }
}
