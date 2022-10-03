import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SapxepdanhsachdoituongNV {
    static int stt = 1;
    private static class NhanVien implements Comparable<NhanVien>{
        private String id, name, sex, birthday, address, taxCode, signDay;

        public NhanVien(String name, String sex, String birthday, String address, String taxtCode, String signDay) {
            this.id = getID(stt++);
            this.name = name;
            this.sex = sex;
            this.birthday = standardDay(birthday);
            this.address = address;
            this.taxCode = taxtCode;
            this.signDay = standardDay(signDay);
        }
        static String getID(int n) {
            String s = String.valueOf(n);
            while(s.length() < 5) s = '0' + s;
            return s;
        }
        public static String standardDay(String s) {
            String [] data = s.split("/");
            if(data[0].length() == 1) data[0] = '0' + data[0];
            if(data[1].length() == 1) data[1] = '0' + data[1];
            return data[0] + '/' + data[1] + '/' + data[2];
        }
        @Override
        public String toString() {
            return this.id + ' ' + this.name + ' ' + this.sex + ' ' + this.birthday + ' ' + this.address + ' ' + this.taxCode + ' ' + this.signDay;
        }
        @Override
        public int compareTo(NhanVien p) {
            int d1 = Integer.parseInt(this.birthday.substring(6));
            int d2 = Integer.parseInt(p.birthday.substring(6));
            if(d1 > d2) return 1;
            if(d1 < d2) return -1;
            d1 = Integer.parseInt(this.birthday.substring(3, 5));
            d2 = Integer.parseInt(p.birthday.substring(3, 5));
            if(d1 > d2) return 1;
            if(d1 < d2) return -1;
            d1 = Integer.parseInt(this.birthday.substring(0, 2));
            d2 = Integer.parseInt(p.birthday.substring(0, 2));
            if(d1 > d2) return 1;
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String sex = sc.next();
            String bd = sc.next();
            sc.nextLine();
            String address = sc.nextLine();
            String tax = sc.next();
            String signD = sc.next();
            ds.add(new NhanVien(name, sex, bd, address, tax, signD));
        }
        Collections.sort(ds);
        for(NhanVien i : ds) System.out.println(i);
    }
}
