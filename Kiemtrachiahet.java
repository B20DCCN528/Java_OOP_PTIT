import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Kiemtrachiahet {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = sc.nextInt();
        while(t --> 0) {
            String s = sc.next();
            int n = Integer.parseInt(s);
            if(n % 7 == 0 && n % 13 == 0)
                System.out.println("Both");
            else if(n % 7 == 0 && n % 13 != 0) {
                 System.out.print("Div ");
                System.out.print(n);
            }
               
            else if(n % 7 != 0 && n % 13 == 0) {
                 System.out.printf("Div ");
                System.out.print(n);
            }
               
            else 
                System.out.println("None");
        }
    }
}
