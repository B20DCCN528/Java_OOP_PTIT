import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhsachDNNhanSVTT1 {
    private static class DoanhNghiep implements Comparable<DoanhNghiep> {
        private String id, name;
        private int receiveNumber;

        public DoanhNghiep(String id, String name, int receiveNumber) {
            this.id = id;
            this.name = name;
            this.receiveNumber = receiveNumber;
        }
        @Override
        public int compareTo(DoanhNghiep p) {
            if(this.receiveNumber < p.receiveNumber) return 1;
            if(this.receiveNumber > p.receiveNumber) return -1;
            return this.id.compareTo(p.id);
        }
        @Override
        public String toString() {
            return this.id + ' ' + this.name + ' ' + String.valueOf(this.receiveNumber);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        int t = sc.nextInt();
        while(t --> 0) {
            sc.nextLine();
            ds.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(ds);
        for(DoanhNghiep tmp : ds) System.out.println(tmp);
    }
}