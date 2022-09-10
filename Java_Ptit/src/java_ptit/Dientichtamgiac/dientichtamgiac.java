
package java_ptit.Dientichtamgiac;
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
            return Math.sqrt((A + B + C) * (A + B - C) * (B + C - A) * (A + C - B)) / 4;
        }
        return -1;
    }
}
