import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Sapxepdanhsachsinhvien {
    private static class SinhVien implements Comparable<SinhVien> {
        private String maSV, tenSV, tenChinh, sdt, email;

        public SinhVien(Scanner sc) {
            this.maSV = sc.next();
            sc.nextLine();
            this.tenSV = sc.nextLine();
            this.tenChinh = layTenChinh(this.tenSV);
            this.sdt = sc.next();
            this.email = sc.next();
        }
        static String layTenChinh(String s) {
            String [] data = s.split("\\s+");
            return data[data.length - 1];
        }
        @Override
        public String toString() {
            return this.maSV + ' ' + this.tenSV + ' ' + this.sdt + ' ' + this.email;
        }
        @Override
        public int compareTo(SinhVien p) {
            if(this.tenChinh.contentEquals(p.tenChinh)){
                if(this.tenSV.contentEquals(p.tenSV))
                    return this.maSV.compareTo(p.maSV);
                return this.tenSV.compareTo(p.tenSV);
            }
            return this.tenChinh.compareTo(p.tenChinh);
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        while(t --> 0) dsSV.add(new SinhVien(sc));
        Collections.sort(dsSV);
        for(SinhVien tmp : dsSV)
            System.out.println(tmp);
    }
}
