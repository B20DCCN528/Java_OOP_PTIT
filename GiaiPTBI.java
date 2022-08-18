
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class GiaiPTBI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a == 0) {
            if(b == 0) {
                System.out.println("VSN");
            }
            else {
                System.out.println("VN");
            }
        }
        else {
            double res = -(double) b / (double) a;
            System.out.printf("%.2f", res);
        }
    }
}
