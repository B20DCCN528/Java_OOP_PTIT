import java.util.Scanner;

public class Sotamphan {
    public static Scanner sc = new Scanner(System.in);
    public static Boolean isValid(char c) {
        return c >= '0' && c <= '2';
    }
    public static void TestCase() {
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            if(!isValid(s.charAt(i))) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while(T --> 0) {
            TestCase();
        }
    }
}
