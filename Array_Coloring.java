import java.util.*;
public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int odd = 0; // Count of odd numbers
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]%2 == 1) odd++;
            }
            if(odd%2!=0){
              System.out.println("NO");
              continue;
            } 
            System.out.println("YES");
        }
        sc.close();
    }
}