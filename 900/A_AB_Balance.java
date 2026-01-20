import java.util.*;

public class A_AB_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
          String s=sc.next();
          int n=s.length();
          if(s.charAt(0)==s.charAt(n-1)){
            System.out.println(s);
            continue;
          }else{
            char ch=s.charAt(0);
            StringBuilder sb=new StringBuilder(s);
            if(ch=='a') sb.setCharAt(0,'b');
            else sb.setCharAt(0,'a');
            s=sb.toString();
            System.out.println(s);
          }
        }
        sc.close();
    }
}