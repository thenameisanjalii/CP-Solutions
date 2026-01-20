import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(canFormGoodArray(a) ? "Yes" : "No");
        }
        sc.close();
    }

    private static boolean canFormGoodArray(int[] a) {
        int n = a.length;
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequencies
        for (int x : a) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        
        // If all elements are the same, it's always possible
        if (freq.size() == 1) {
            return true;
        }
        
        // If more than 2 distinct values, impossible
        if (freq.size() > 2) {
            return false;
        }
        
        // Exactly 2 distinct values - check if they can form alternating pattern
        List<Integer> counts = new ArrayList<>(freq.values());
        int count1 = counts.get(0);
        int count2 = counts.get(1);
        
        // For alternating pattern:
        // - If n is even: both counts must be n/2
        // - If n is odd: one count is (n+1)/2, other is (n-1)/2
        if (n % 2 == 0) {
            return count1 == n / 2 && count2 == n / 2;
        } else {
            return Math.abs(count1 - count2) == 1;
        }
    }
}
