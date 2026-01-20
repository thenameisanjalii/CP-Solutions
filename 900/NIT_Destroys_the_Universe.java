import java.util.*;

public class NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases

        while (tc-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            int[] arr = new int[n + 1]; // 1-based indexing, arr[0] = 0 by default

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] > 0 && arr[i - 1] == 0) {
                    count++;
                }
            }

            System.out.println(Math.min(count, 2));
        }

        sc.close();
    }
}
