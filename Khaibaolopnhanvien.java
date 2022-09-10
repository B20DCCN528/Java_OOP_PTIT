import java.util.Scanner;

class Nhanvien {
    String maNV;
    String ten;
    String gioitinh;
    String ngaysinh;
    String diachi;
    String masothue;
    String ngaykihopdong;

    void Input() {
        Scanner sc = new Scanner(System.in);
        maNV = "00001";
        ten = sc.nextLine();
        gioitinh = sc.next();
        ngaysinh = sc.next();
        sc.nextLine();
        diachi = sc.nextLine();
        masothue = sc.next();
        ngaykihopdong = sc.next();
    }
    void Output()  {
        System.out.printf("%s %s %s %s %s %s %s", maNV, ten, gioitinh, ngaysinh, diachi, masothue, ngaykihopdong);
    }
}

public class Khaibaolopnhanvien {
    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien();
        nv.Input();
        nv.Output();
    }
}
