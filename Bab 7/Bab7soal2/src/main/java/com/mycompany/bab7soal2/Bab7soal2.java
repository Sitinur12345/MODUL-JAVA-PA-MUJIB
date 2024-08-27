/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;
import java.util.Scanner;

/**
 *
 * @author halimah
 */
public class Bab7soal2 {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Input data mahasiswa
        System.out.print("NIM : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA : ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("PILIH PEMINATAN : ");
        char peminatan = scanner.nextLine().charAt(0);
        
         // Menutup scanner
        scanner.close();

        // Menampilkan output berdasarkan peminatan dan tahun
        switch( tahun){
          case 1:
          case 2:
          case 3:
          case 4:
            switch (peminatan) {
               case 'M':
                   System.out.println("PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA 2");
                   break;
               case 'W':
                   System.out.println("WEB DEVELOPMENT, FRONTEND DEVELOPMENT");
                   break;
               case 'D':
                   System.out.println("DATA SCIENCE, MACHINE LEARNING");
                   break;
               default:
                   System.out.println("Peminatan tidak dikenal.");
                   break;
            }
        }
    }
}
