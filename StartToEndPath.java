import java.util.*;
public class StartToEndPath {
    public static boolean findPath(int[][] a, int i, int j, int n) {
        if (i < 0 || j < 0 || i >= n || j >= n || a[i][j] != 1) {
            return false;
        }
        a[i][j] = 2;
        if (i == n - 1 && j == n - 1) {
            return true;
        }
        if (findPath(a, i, j + 1, n)) return true;
        if (findPath(a, i + 1, j, n)) return true;
        a[i][j]=1;
        return false;
    }

    public static void printPath(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 2)
                    System.out.print("_ ");
                else
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s1.nextInt();
            }
        }
        if (a[0][0] == 0 || a[n - 1][n - 1] == 0) {
            System.out.println("No Path Found");
        } else if (findPath(a, 0, 0, n)) {
            printPath(a, n);
        } else {
            System.out.println("No Path Found");
        }
    }
}
