import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Ghepma {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner f1 = new Scanner(new File("DATA1.in"));
        Scanner f2 = new Scanner(new File("DATA2.in"));
        TreeSet<String> data = new TreeSet<>();
        for(String i : f1) {
            for(int j : f2) {
                data.add(f1 + f2.toString());
            }
        }
        for(String i : data) {
            System.out.println(i);
        }
    }
}
