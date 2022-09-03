import java.util.HashSet;
import java.util.Scanner;

public class Tapturiengcua2xau {
    public static Scanner sc = new Scanner(System.in);

    public static void Check() {
        String[] a = sc.nextLine().split("\\s+");
        String b = sc.nextLine();
        HashSet<String> c = new HashSet<>();
        for(String i : a) {
            if(!b.contains(i)) {
                c.add(i);
            }
        }
        for(String i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0) {
            Check();
        }
    }
}
