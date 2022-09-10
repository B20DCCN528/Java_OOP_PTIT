
package java_ptit.Dientichtamgiac;
import java.util.Scanner;
public class main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.x = sc.nextDouble();
            A.y = sc.nextDouble();
            B.x = sc.nextDouble();
            B.y = sc.nextDouble();
            C.x = sc.nextDouble();
            C.y = sc.nextDouble();


            double k = A.checkTriagle(B, C);
            if(k != -1) 
                System.out.printf("%.2f\n", k);
            else 
                System.out.println("INVALID");
        }
    }
}
