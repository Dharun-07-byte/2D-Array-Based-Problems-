import java.util.*;

public class LC766_ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        boolean ok = true;
        for (int i = 1; i < rows; i++)
            for (int j = 1; j < cols; j++)
                if (a[i][j] != a[i - 1][j - 1]) ok = false;

        System.out.println(ok);
        sc.close();
    }
}
