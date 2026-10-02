import java.util.*;

public class LC2319_XMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        boolean ok = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean diagonal = (i == j || i + j == n - 1);
                if (diagonal && a[i][j] == 0) ok = false;
                if (!diagonal && a[i][j] != 0) ok = false;
            }
        }

        System.out.println(ok);
        sc.close();
    }
}
