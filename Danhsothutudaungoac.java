import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Danhsothutudaungoac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0) {
            String s = sc.nextLine();
            int dem = 1;
            Vector<Integer> v = new Vector<>();
            Stack<Integer> stk = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stk.add(dem);
                    v.add(dem);
                    dem++;
                }
                else if(s.charAt(i) == ')') {
                    v.add(stk.peek());
                    stk.pop();
                }
            } 
            for(int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " 1");
                
            }
            System.out.println();
        }
    }
    
}
