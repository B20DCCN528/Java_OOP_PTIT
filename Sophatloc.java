
import java.math.BigInteger;
import java.util.Scanner;

public class Sophatloc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("86");
            BigInteger c = new BigInteger("100");
            BigInteger[] ans = a.divideAndRemainder(c);
            if(ans[1].compareTo(b) == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        
    }
}
