

import java.text.DecimalFormat;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Chiatamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1; i < n; i++) {
                double a = h * Math.sqrt((double) i / n);
                DecimalFormat df = new DecimalFormat("#.000000");
                System.out.println(df.format(a) + " ");
            }
            System.out.println();
        }
    }
}
