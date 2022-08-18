
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fibo = new long[96];
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i < 93; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        int T = sc.nextInt();
        while(T > 0) {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
            T--;
        }
    }
}
