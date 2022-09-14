import java.util.Scanner;
class NhanVien {
    private final String id, name;
    private final long luongCB, ngayLV, luong, thuong, phucap, thunhap;
    private final String chucvu;

    NhanVien(String name, long luongCB, long ngayLV, String chucvu) {
        this.id = "NV01";
        this.name = name;
        this.luongCB = luongCB;
        this.ngayLV = ngayLV;
        this.luong = luongCB * ngayLV;
        if(ngayLV >= 25) this.thuong = this.luong/5;
        else if(ngayLV >= 22) this.thuong = this.luong/10;
        else this.thuong = 0;
        this.chucvu = chucvu;
        if(chucvu.contentEquals("GD")) this.phucap = 250000;
        else if(chucvu.contentEquals("PGD")) this.phucap = 200000;
        else if(chucvu.contentEquals("TP")) this.phucap = 180000;
        else this.phucap = 150000;
        this.thunhap = this.luong + this.thuong + this.phucap;
    }
    void in() {
        System.out.println(this.id + ' ' + this.name + ' ' + this.luong + ' ' + this.thuong + ' ' + this.phucap + ' ' + this.thunhap);

    }
    
}
public class Baitoantinhcong {
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            NhanVien p = new NhanVien(sc.nextLine(),sc.nextLong(),sc.nextLong(),sc.next());
            p.in();
        }
    }