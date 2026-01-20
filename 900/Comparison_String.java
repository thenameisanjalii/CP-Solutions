import java.util.*;

public class Comparison_String {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-->0){
      int n= sc.nextInt();
      String a  = sc.next();

      char[] str = a.toCharArray();
      int count=1, maxi=1;

      char prev = str[0];
      for(int i=1;i<n;i++){
        if(str[i] == prev){
          count++;
        }else{
          maxi = Math.max(maxi, count);
          count=1;
        } 
        prev = str[i]; 
      }
      maxi = Math.max(maxi, count);
      System.out.println(maxi+1);
    }
    
    
    sc.close();
  }
}