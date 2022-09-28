import java.util.ArrayList;
import java.util.Scanner;

public class DanhsachdoituongSV2 {
    public static int stt = 1;
    private static class SinhVien {
        private String id, name, lop, birthday;
        private double gpa;

        public static String getID(int n) {
            String s = String.valueOf(n);
            while(s.length() < 3) s = '0' + s;
            return "B20DCCN" + s;
        }
        public static String standardDay(String s) {
            String [] data = s.split("/");
            if(data[0].length() == 1) data[0] = '0'  + data[0];
            if(data[1].length() == 1) data[1] = '0'  + data[1];
            return data[0] + '/' + data[1] + '/' + data[2];
        }
        public SinhVien(Scanner sc) {
            this.id = getID(stt++);
            this.name = standardName(sc.nextLine());
            this.lop = sc.next();
            this.birthday = standardDay(sc.next());
            this.gpa = sc.nextDouble();
        }
        public static String standardName(String s) {
            s = s.trim().toLowerCase();
            String res = "" + Character.toUpperCase(s.charAt(0));
            for(int i = 1;i < s.length(); i++) {
                if(Character.isLetter(s.charAt(i))) {
                    if(s.charAt(i - 1) == ' ') res += " " + Character.toUpperCase(s.charAt(i));
                    else res += s.charAt(i);
                }
            }
            return res;
        }
        @Override
        public String toString() {
            return this.id + ' ' + this.name + ' ' + this.lop + ' ' + this.birthday + ' ' + String.format("%.2f", this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            ds.add(new SinhVien(sc));
        }
        for(SinhVien i : ds) System.out.println(i);
    }
}
