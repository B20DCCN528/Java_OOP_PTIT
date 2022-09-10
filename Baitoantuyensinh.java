import java.util.Scanner;

class Thisinh {
    private String id, name;
    private double toan, li , hoa, uutien, tong;
    private String tt;

    Thisinh(String id, String name, double toan, double li, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
        this.uutien = 0;
        if(id.startsWith("KV1")) this.uutien = 0.5;
        if(id.startsWith("KV2")) this.uutien = 1.0;
        if(id.startsWith("KV3")) this.uutien = 2.5;

        this.tong = toan * 2 + li + hoa;
        if(this.tong + this.uutien >= 24) this.tt = "TRUNG TUYEN";
        else this.tt = "TRUOT";
    }
    void in() {
        System.out.print(this.id + ' ' + this.name + ' ');
        if((int)this.uutien == this.uutien) System.out.printf("%.0f ", this.uutien);
        else System.out.printf("%.1f ", this.uutien);
        if((int)this.tong == this.tong) System.out.printf("%.0f ", this.tong);
        else System.out.printf("%.1f ", this.tong);
        System.out.println(this.tt);
    }
}

public class Baitoantuyensinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thisinh p = new Thisinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        p.in();
    }
}
