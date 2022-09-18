import java.lang.management.LockInfo;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Mathang {
    static int id = 1;
    String maMatHang;
    String tenMathang;
    String donViTinh;
    int giaMua;
    int giaBan;
    int loiNhuan;

    void input(Scanner sc) {
        if(id < 10)
            maMatHang = "MH00";
        else if(id < 100) 
            maMatHang = "MH0";
        else 
            maMatHang = "MH";
        maMatHang += Integer.toString(id++);
        sc.nextLine();
        tenMathang = sc.nextLine();
        donViTinh = sc.nextLine();
        giaMua = sc.nextInt();
        giaBan = sc.nextInt();
        loiNhuan = giaBan - giaMua;
    }
    void output() {
        System.out.printf("%s %s %s %d %d %d\n", maMatHang, tenMathang, donViTinh, giaMua, giaBan, loiNhuan);
    }
}
public class Danhsachmathang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Mathang> v = new Vector<>();
        for(int i = 0; i < n; i++) {
            Mathang x = new Mathang();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<Mathang>() {
            @Override
            public int compare(Mathang a, Mathang b) {
                if(a.loiNhuan == b.loiNhuan) {
                    if(a.maMatHang.compareTo(b.maMatHang) > 0)
                        return 1;
                    else 
                        return -1;
                }
                else if(a.loiNhuan < b.loiNhuan)
                    return 1;
                else 
                    return -1;
            }
        });
        for(int i = 0; i < n; i++) 
            v.get(i).output();
    }
}
