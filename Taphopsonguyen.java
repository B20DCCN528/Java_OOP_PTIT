import java.util.Scanner;

public class Taphopsonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(), x;
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
        for(int i = 0; i <= 1000; i++) {
            if(a[i] == 1 && b[i] == 1)
                System.out.printf("%d ", i);
        }
        System.out.println();
        for(int i = 0; i <= 1000; i++) {
            if(a[i] == 1 && b[i] == 0)
                System.out.printf("%d ", i);
        }
        System.out.println();
        for(int i = 0; i <= 1000; i++) {
            if(a[i] == 0 && b[i] == 1)
                System.out.printf("%d ", i);
        }
    }
}
