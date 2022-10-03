import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sapxepmatran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt() - 1;
            int a[][] = new int [n][m];
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    if(j == p) tmp.add(a[i][j]);
                }
            }
            Collections.sort(tmp);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(j == p) System.out.print(tmp.get(i) + " ");
                    else System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
