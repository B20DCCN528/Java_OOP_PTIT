/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TinhTong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long S, n;
        while(T > 0) {
            n = sc.nextInt();
            S = (n * (n  + 1)) / 2;
            System.out.println(S);
            T--;
        }
    
    
        
        
    }
}
