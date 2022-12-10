import java.util.Scanner;
import java.util.Stack;

public class Kiemtrangoacdung {
    private static boolean checkCapKyTu(char a, char b) {
        return a == '(' && b == ')' || a == '[' && b == ']';

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0) {
            String s = sc.nextLine();
            Stack<Character> stk = new Stack<>();
            int check = 1;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ')' || s.charAt(i) == ']') {
                    if(!stk.empty()) {
                        char tmp = stk.peek();
                        stk.pop();
                        if(!checkCapKyTu(tmp, s.charAt(i))) {
                            check = 0;
                            break;
                        }
                    }
                    else {
                        check = 0;
                        break;
                    }
                }
                else if(s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stk.add(s.charAt(i));
                }
                else {
                    continue;
                }
            }
            if(check == 0 || !stk.empty()) System.out.println("NO");
            else System.out.println("YES");
        }
    } 
}