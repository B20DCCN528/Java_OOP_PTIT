import java.io.File;
import java.io.FileNotFoundException;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Danhsachmonhoc {
    private static class Monhoc implements Comparable<Monhoc> {
        private String maMon, tenMon;
        private int soTinChi;

        public Monhoc(Scanner sc) {
            this.maMon = sc.next();
            sc.nextLine();
            this.tenMon = sc.nextLine();
            this.soTinChi = sc.nextInt();
        }
        @Override
        public String toString() {
            return this.maMon + ' ' + this.tenMon + ' ' + String.format("%d", this.soTinChi);
        }
        @Override
        public int compareTo(Monhoc b) {
            return this.tenMon.compareTo(b.tenMon);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        ArrayList<Monhoc> ds = new ArrayList<>();
        while(t --> 0) {
            ds.add(new Monhoc(sc));
        }
        Collections.sort(ds);
        for(Monhoc tmp : ds) {
            System.out.println(tmp);
        }
    }
}
