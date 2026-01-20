import java.util.*;

public class Avto_Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases

        while (tc-- > 0) {
            long n = sc.nextLong();
            long max = -1, min = -1;
            if(n%2==1 || n<4){
              System.out.println(-1);
              continue;
            }
            long fours = n/4;
            long six = n/6;
            max = fours;
            if(n%6==0) min = six;
            else{
              if(n%6==4) min = six+1;
              else if(n%6==2) min= ((n-4)/6)+2;
            }
            System.out.println(min + " " + max);
        }

        sc.close();
    }
}
