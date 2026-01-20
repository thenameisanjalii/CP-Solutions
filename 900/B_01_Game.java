import java.util.*;

public class B_01_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s=sc.next();
            int zeroes=0,ones=0;
            for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='0') zeroes++;
              else ones++;
            }
            int moves=Math.min(zeroes,ones);
            if(moves%2==1) System.out.println("DA");
            else System.out.println("NET");
        }
        sc.close();
    }
}