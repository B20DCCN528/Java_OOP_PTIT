import java.util.Scanner;

public class Inmatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++) {
                int p1 = 0, p2 = n, st = 1;
                if(i % 2 == 1) {
                    p1 = n - 1;
                    p2 = -1;
                    st = -1;
                }
                for(int j = p1; j != p2; j += st) {
                    System.out.printf("%d ", a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
