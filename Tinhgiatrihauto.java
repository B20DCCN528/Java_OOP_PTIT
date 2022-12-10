import java.util.Scanner;
import java.util.Stack;

public class Tinhgiatrihauto {
    private static boolean isDau(char s) {
        return s == '+' || s == '-' || s == '*' || s == '/';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0) {
            int n = sc.nextInt();

            String s = sc.nextLine() + " ";
            Stack<String> stk = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
                if(isDau(s.charAt(i)) && s.charAt(i - 1) == ' ' && s.charAt(i + 1) == ' ') {
                    String a = stk.peek();
                    stk.pop();
                    String b = stk.peek();
                    stk.pop();
                    if(s.charAt(i) == '+') stk.add(Integer.parseInt(a) + Integer.parseInt(b));
                    if(s.charAt(i) == '-') stk.add(Integer.parseInt(b) - Integer.parseInt(a));
                    if(s.charAt(i) == '*') stk.add(Integer.parseInt(b) * Integer.parseInt(a));
                    if(s.charAt(i) == '/') stk.add(Integer.parseInt(b) / Integer.parseInt(a));
                }
                else if(s.charAt(i) == ' ') {
                    continue;
                }
                else {
                    stk.add()
                }
            }
        }
    }
}
