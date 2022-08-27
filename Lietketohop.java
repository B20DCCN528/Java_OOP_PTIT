import java.util.Scanner;

public class Lietketohop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = 0;
        int a[] = new int[k + 1];
        for(int i = 1; i <= k; i++) {
            a[i] = i;
        }
        while(true) {
            s++;
            int ok = 0;
            for(int i = 1; i <= k; i++) {
                System.out.printf("%d ", a[i]);
            }
            System.out.println();
            for(int i = k; i >= 1; i--) {
                if(a[i] != n - k + i) {
                    ok = 1;
                    a[i]++;
                    for(int j = i + 1; j <= k; j++) {
                        a[j] = a[j - 1] + 1;
                    }
                    break;
                }
            }
            if (ok == 0)
                break;
        }
        System.out.printf("Tong cong co %d to hop", s);
    }
}