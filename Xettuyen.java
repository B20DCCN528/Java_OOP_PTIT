import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Xettuyen {
    static int stt = 1;
    private static class ThiSinh {
        private String id, name, birthDay, type;
        private double lt, th, uutien;
        private int tongdiem, tuoi;

        ThiSinh(String name, String birthDay, double lt, double th) {
            this.id = getId(stt++);
            this.name = chuanHoaTen(name);
            this.birthDay = birthDay;
            this.lt = lt;
            this.th = th;
            this.tuoi = getTuoi(this.birthDay);
            if(this.th >= 8 && this.lt >= 8) this.uutien = 1;
            else if(this.lt >= 7.5 && this.th >= 7.5) this.uutien = 0.5;
            else this.uutien = 0;
            this.tongdiem = (int) Math.round((this.lt + this.th) / 2 + this.uutien);
            if(this.tongdiem > 10) this.tongdiem = 10;
            if(this.tongdiem > 8) this.type = "Xuat sac";
            else if(this.tongdiem > 7) this.type = "Gioi";
            else if(this.tongdiem > 6) this.type = "Kha";
            else if(this.tongdiem >= 5) this.type = "Trung binh";
            else this.type = "Truot";
        }
        static String getId(int n) {
            String s = String.valueOf(n);
            if(s.length() == 1) s = '0' + s;
            return "PH" + s;
        }
        static String chuanHoaTen(String s) {
            s = s.trim().toLowerCase();
            String res = "" + Character.toUpperCase(s.charAt(0));
            for(int i = 1; i < s.length(); i++) {
                if(Character.isLetter(s.charAt(i))) {
                    if(s.charAt(i - 1) == ' ') res += " " + Character.toUpperCase(s.charAt(i));
                    else res += s.charAt(i);
                }
            }
            return res;
        }
        static int getTuoi(String birthDay) {
            String [] data = birthDay.split("/");
            return 2021 - Integer.parseInt(data[2]);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<ThiSinh> ds = new ArrayList<>();
        int t = sc.nextInt();
        while(t -- > 0) {
            sc.nextLine();
            ds.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for(ThiSinh tmp : ds)
            System.out.printf("%s %s %d %d %s\n", tmp.id, tmp.name, tmp.tuoi, tmp.tongdiem, tmp.type);
    }
}
