import java.util.Scanner;

public class Sophuc {
    private int thuc, ao;
    public Sophuc() {

    }
    public Sophuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    Sophuc add(Sophuc p) {
        Sophuc n = new Sophuc();
        n.thuc = this.thuc + p.thuc;
        n.ao = this.ao + p.ao;
        return n;
    }
    Sophuc mul(Sophuc p) {
        Sophuc n = new Sophuc();
        n.thuc = this.thuc * p.thuc - this.ao*p.ao;
        n.ao = this.ao * p.thuc + this.thuc * p.ao;
        return n;
    }
    @Override
    public String toString() {
        String s = "";
        s += String.valueOf(this.thuc);
        if(this.ao < 0) s += " - ";
        else s += " + ";
        s += String.valueOf(Math.abs(this.ao)) + 'i';
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            Sophuc a = new Sophuc(sc.nextInt(),sc.nextInt());
            Sophuc b = new Sophuc(sc.nextInt(),sc.nextInt());
            Sophuc e = a.add(b);
            System.out.print(e.mul(a));
            System.out.print(", ");
            System.out.println(e.mul(e));
        }
    }
}
