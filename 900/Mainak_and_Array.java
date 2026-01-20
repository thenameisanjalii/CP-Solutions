import java.util.*;

public class Mainak_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int maxi = -1, mini = 10000;
            int maxIdx = -1, minIdx = -1;

            // Read array and track min and max elements with their indices
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > maxi) {
                    maxi = arr[i];
                    maxIdx = i;
                }
                if (arr[i] < mini) {
                    mini = arr[i];
                    minIdx = i;
                }
            }

            if (minIdx == 0 || maxIdx == n - 1) {
                System.out.println(maxi - mini);
            } else {
                int a = maxi - arr[0];         // Move max to end
                int b = arr[n - 1] - mini;     // Move min to start

                int c = Integer.MIN_VALUE;
                for (int i = 1; i < n; i++) {
                    c = Math.max(c, arr[i - 1] - arr[i]); // Best adjacent pair
                }

                System.out.println(Math.max(Math.max(a, b), c));
            }
        }

        sc.close();
    }
}
