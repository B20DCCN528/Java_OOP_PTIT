import java.util.ArrayList;
import java.util.Scanner;

public class Tinhgiaban1 {
    static int stt = 1;
    private static class MatHang {
        private String id, name, unit;
        private double donvi, sl, phi, thanhtien, gia;
        
        MatHang(Scanner sc) {
            this.id = getID(stt++);
            this.name = sc.next();
            this.unit = sc.next();
            this.donvi = sc.nextDouble();
            this.sl = sc.nextDouble();
            this.phi = Math.round(this.donvi * this.sl * 5 /100);
            this.thanhtien = Math.round(this.donvi * this.sl + this.phi);
            this.gia = Math.round(this.thanhtien * 102/100);
        }
        static String getID(int n) {
            String s = String.valueOf(n);
            if(s.length() == 1) s = '0' + s;
            return "MH" + s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> ds = new ArrayList<>();
        while(t --> 0) {
            ds.add(new MatHang(sc));
        }
        for(MatHang tmp : ds) {
            System.out.printf("%s %s %s %.0f %.0f %.0f\n", tmp.id, tmp.name, tmp.unit, tmp.phi, tmp.thanhtien, tmp.gia);
        }
    }
}
