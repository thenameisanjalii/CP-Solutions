import java.util.*;

public class Forbidden_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // target sum
            int k = sc.nextInt(); // available numbers from 1 to k
            int x = sc.nextInt(); // unavailable number

            // Build available numbers list
            List<Integer> available = new ArrayList<>();
            for (int i = 1; i <= k; i++) {
                if (i != x) {
                    available.add(i);
                }
            }

            // If there's no number available at all
            if (available.isEmpty()) {
                System.out.println("NO");
                continue;
            }

            // Try greedy approach using smallest available number
            int smallest = available.get(0);
            List<Integer> res = new ArrayList<>();

            int sum = 0;
            while (n - sum >= smallest) {
                res.add(smallest);
                sum += smallest;
            }

            // Try to adjust the last few values if needed
            int extra = n - sum;
            boolean fixed = false;
            if (extra > 0) {
                for (int i = 1; i < available.size(); i++) {
                    int last = available.get(i);
                    if (last - smallest == extra) {
                        res.remove(res.size() - 1);
                        res.add(last);
                        fixed = true;
                        break;
                    }
                }
            } else fixed = true;

            if (sum == n || fixed && sum + extra == n) {
                System.out.println("YES");
                System.out.println(res.size());
                for (int val : res) System.out.print(val + " ");
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}
