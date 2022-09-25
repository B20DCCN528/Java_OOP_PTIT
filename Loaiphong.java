import java.io.*;
import java.util.*;
public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id, name;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String s) {
        String [] data = s.split("\\s+");
        this.id = data[0];
        this.name = data[1];
        this.donGia = Integer.parseInt(data[2]);
        this.phiPhucVu = Double.parseDouble(data[3]);
    }
    @Override
    public int compareTo(LoaiPhong p) {
        return this.name.compareTo(p.name);
    }
    @Override
    public String toString() {
        return this.id + ' ' + this.name + ' ' + String.valueOf(this.donGia) + ' ' + String.format("%.2f", this.phiPhucVu);
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner sc = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n --> 0) {
            ds.add(new LoaiPhong(sc.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
            
    }
}
