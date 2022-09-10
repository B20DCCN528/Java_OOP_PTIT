import java.util.Scanner;
import java.lang.Math;
class Point {
    double x;
    double y;

    double distance(Point p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
    double checkTriagle(Point a, Point b) {
        double A = this.distance(a);
        double B = this.distance(b);
        double C = a.distance(b);
        if(A + B > C && B + C > A && A + C > B) {
            return Math.sqrt((A + B + C) * (A + B - C) * (-A + B + C) * (A - B + C)) / 4;
        }
        return -1;
    }
}


public class Dientichtamgiac {
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
