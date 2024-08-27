/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal1;
import java.util.Scanner;
/**
 *
 * @author halimah
 */
public class Bab6soal1 { 
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
         
        String grade;
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70)  {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "c";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "E";

        System.out.println("Grade: " + grade);
        
        scanner.close();
        
        }
    }
}

