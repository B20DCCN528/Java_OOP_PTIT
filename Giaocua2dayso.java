import java.util.Scanner;

public class Giaocua2dayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x;
        int a[] = new int[1001];
        int b[] = new int[1001];
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            a[x] = 1;
        }
        for(int i = 0; i < m; i++) {
            x = sc.nextInt();
            b[x] = 1;
        }
        for(int i = 1; i <= 1000; i++) {
            if(a[i] == 1 && b[i] == 1)
                System.out.printf("%d ", i);
        }
    }
}