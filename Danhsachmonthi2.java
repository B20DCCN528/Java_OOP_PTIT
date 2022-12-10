import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;


class Subject implements Comparable<Subject> {
    private String maMon, tenMon, status;
    public Subject(String maMon, String tenMon, String status) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.status = status;
    }
    public String getMaMon() {
        return maMon;
    }
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + status;
    }
    @Override
    public int compareTo(Subject o) {
        return this.maMon.compareTo(o.getMaMon());
    }
}
public class Danhsachmonthi2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> list = new ArrayList<>();

        while(sc.hasNextLine()) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String status = sc.nextLine();
            list.add(new Subject(maMon, tenMon, status));
        }
            
        TreeMap<String, Integer> mp = new TreeMap<>();
        Collections.sort(list);
        for(Subject e : list) {
            if(!mp.containsKey(e.getMaMon())) {
                System.out.println(e);
                mp.put(e.getMaMon(), 1);
            }
        }
    }
}
