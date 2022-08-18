/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;



/**
 *
 * @author ADMIN
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        if(length <= 0 || width <= 0) {
            System.out.print("0");
        }
        else {
            int area = length * width;
            int perimeter = (width + length) * 2;
            System.out.printf("%d %d", perimeter, area);
        }
        
    }
    
}
