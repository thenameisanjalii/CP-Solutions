import java.util.*;

public class TargetScoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] grid = new char[10][10];
            for (int i = 0; i < 10; i++) {
                grid[i] = sc.next().toCharArray();
            }

            int score = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 'X') {
                        int distFromEdge = Math.min(Math.min(i, 9-i), Math.min(j, 9-j));
                        int ring = distFromEdge + 1;
                        if (ring <= 5) {
                            score += ring;
                        }
                    }
                }
            }

            System.out.println(score);
        }
        sc.close();
    }
}
