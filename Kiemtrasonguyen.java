import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Kiemtrasonguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = sc.nextInt();
        while(t --> 0) {
            BigInteger x = new BigInteger("7");
            BigInteger y = new BigInteger("13");
            BigInteger z = new BigInteger("0");
            BigInteger a = sc.nextBigInteger();
            if(a.mod(x).equals(z)) {
                if(a.mod(y).equals(z)) System.out.println("Both"); 
                else System.out.println("Div 7");
            }
            else if(a.mod(y).equals(z)) {
                System.out.println("Div 13");
            }
            else System.out.println("None");   
            
        }
    }
}
