import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Danhsachcathi {
    static int stt = 1;
    private static class CaThi implements Comparable<CaThi> {
        private String maCT, ngayThi, gioThi, phongThi;
        public CaThi(Scanner sc) {
            this.maCT = layMaCT(stt++);
            this.ngayThi = sc.next();
            this.gioThi = sc.next();
            this.phongThi = sc.next();

        }
        static String layMaCT(int n) {
            String s = String.valueOf(n);
            while(s.length() < 3) s = '0' + s;
            return "C" + s;
        }
        @Override
        public String toString() {
            return this.maCT + ' ' + this.ngayThi + ' ' + this.gioThi + ' ' + this.phongThi;
        }
        @Override
        public int compareTo(CaThi p) {
            if(!this.ngayThi.contentEquals(p.ngayThi)) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date daythis = sdf.parse(this.ngayThi);
                    Date dayO = sdf.parse(p.ngayThi);
                    return daythis.compareTo(dayO);
                }
                catch (ParseException ex) {
                    Logger.getLogger(Danhsachcathi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(this.gioThi.contentEquals(p.gioThi))
                return this.maCT.compareTo(p.maCT);
            return this.gioThi.compareTo(p.gioThi);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = sc.nextInt();
        ArrayList<CaThi> dsCT = new ArrayList<>();
        for(int i = 0; i < t; i++) dsCT.add(new CaThi(sc));
        Collections.sort(dsCT);
        for(CaThi tmp : dsCT) 
            System.out.println(tmp);
    }
}
