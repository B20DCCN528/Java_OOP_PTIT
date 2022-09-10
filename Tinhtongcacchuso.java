import java.util.Scanner;
import java.util.Arrays;

public class Tinhtongcacchuso {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t --> 0) {
        String s = sc.next();
        int a = 0, count = 0;
        int b[] = new int[256];
        for(int i = 0; i < s.length(); i++) {
            if(s[i] >= '0' && s[i] <= '9') {
                a += s[i] - '0';
            }
            else {
                b[count++] = s[i];
            }
        }
        Arrays.sort(b);
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.print(a);
        System.out.println();
        
    }
    sc.close();
}
