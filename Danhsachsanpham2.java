import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Danhsachsanpham2 {
    private static class SanPham implements Comparable<SanPham> {
        private String maSP, tenSP;
        private int giaBan, thoiHanBaoHanh;

        public SanPham(Scanner sc) {
            this.maSP = sc.next();
            sc.nextLine();
            this.tenSP = sc.nextLine();
            this.giaBan = sc.nextInt();
            this.thoiHanBaoHanh = sc.nextInt();
        }

        @Override
        public String toString() {
            return this.maSP + ' ' + this.tenSP + ' ' + String.format("%d %d", this.giaBan, this.thoiHanBaoHanh);
        }
        @Override
        public int compareTo(SanPham p) {
            if(this.giaBan < p.giaBan) return 1;
            if(this.giaBan > p.giaBan) return -1;
            return this.maSP.compareTo(p.maSP);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<SanPham> dsSP = new ArrayList<>();
        while(t --> 0) dsSP.add(new SanPham(sc));
        Collections.sort(dsSP);
        for(SanPham tmp : dsSP) 
            System.out.println(tmp);
    }
    
}
