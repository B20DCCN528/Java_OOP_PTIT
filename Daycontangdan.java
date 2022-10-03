import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Daycontangdan {
    public static int x[] = new int[100];
    public static int a[] = new int[100];
    public static int n;
    public static String res = "";
    public static ArrayList<String> result = new ArrayList<>();

    public static void backtracking(int i) {
        if(i >= n) {
            return;
        }
        for(int j = i + 1; j <= n; j++) {
            if(a[j] < a[i]) continue;
            String tmp = res;
            res += a[j] + " ";
            if(res.split("\\s+").length > 1) 
                result.add(res);
            backtracking(j);
            res = tmp;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a[0] = 0;
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        backtracking(0);
        Collections.sort(result);
        for(String s : result)
            System.out.println(s);
    }
}
