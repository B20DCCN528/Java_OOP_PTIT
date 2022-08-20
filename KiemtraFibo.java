
import java.util.Scanner;
public class KiemtraFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            long n = sc.nextLong();
            if(Fibo(n) == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static long Fibo(long n) {
        long[] M = new long[100];
        M[0] = 0; M[1] = 1;
        for(int i = 2; i < 100; i++) {
            M[i] = M[i - 1] + M[i - 2];
        }
        for(int i = 0; i < 100; i++) 
            if(M[i] == n) return 1;
            return 0;
        

    }
}
