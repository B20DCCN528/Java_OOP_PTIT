import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bangxephang {
    private static class SinhVien implements Comparable<SinhVien> {
        private String name;
        private int ac, sum;

        public SinhVien(Scanner sc) {
            this.name = chuanHoaTen(sc.nextLine());
            this.ac = sc.nextInt();
            this.sum = sc.nextInt();
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
        @Override 
        public String toString() {
            return this.name + ' ' + this.ac + ' ' + this.sum;
        }
        @Override
        public int compareTo(SinhVien p) {
            if(this.ac < p.ac) return 1;
            else if(this.ac == p.ac) {
                if(this.sum > p.sum) {
                    return 1;
                }
                else return -1;
            }
            return this.name.compareTo(p.name);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t --> 0) {
            ds.add(new SinhVien(sc));
        }
        Collections.sort(ds);
        for(SinhVien tmp : ds) {
            System.out.println(tmp);
        }
    }
}
