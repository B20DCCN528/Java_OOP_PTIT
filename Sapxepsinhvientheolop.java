import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Sapxepsinhvientheolop {
    private static class SinhVien implements Comparable<SinhVien> {
        private String id, name, clas, email;

        public SinhVien(String id, String name, String clas, String email) {
            this.id = id;
            this.name = name;
            this.clas = clas;
            this.email = email;
        }
        @Override
        public String toString() {
            return this.id + ' ' + this.name + ' ' + this.clas + ' ' + this.email;
        }
        @Override
        public int compareTo(SinhVien p) {
            if(p.clas.contentEquals(this.clas))
                return this.id.compareTo(p.id);
            return this.clas.compareTo(p.clas);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t --> 0) {
            ds.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(SinhVien tmp : ds) {
            System.out.println(tmp);
        }
    }
}
