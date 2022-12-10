
import java.io.File;
import java.io.FileNotFoundException;;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Thietlapdiachigmail2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> ma = new HashMap<String, Integer>();
        Map<String, Integer> m = new HashMap<String, Integer>();
        
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            String x = "";
            String tmp;
            s = s.toLowerCase() + " ";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ') {
                    if(x != "") {
                        a.add(x);
                        x = "";
                    }
                }
                else {
                    x += s.charAt(i);
                }
            }
            s = a.get(a.size() - 1);

            tmp = a.get(a.size() - 1);

            for(int i = 0; i < a.size() - 1; i++) {
                s += a.get(i).substring(0, 1);
                tmp += a.get(i);
            }

            if(m.get(tmp) == null) {
                m.put(tmp, 1);
            }
            else {
                m.put(tmp, m.get(tmp) + 1);
            }


            if(ma.get(s) == null) {
                ma.put(s, 1);
                x = "";
            }
            else {
                if(m.get(tmp) > 1) {
                    continue;
                }
                x = Integer.toString(ma.get(s) + 1);
                ma.put(s, ma.get(s) + 1);
            }

            System.out.println(s + x + "@ptit.edu.vn");
            
        }
    }
}
