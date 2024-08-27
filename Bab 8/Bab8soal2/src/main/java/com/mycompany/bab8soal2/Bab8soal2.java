/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2;
import java.util.Scanner;

/**
 *
 * @author halimah
 */
public class Bab8soal2 {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();
        
        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();
       
        System.out.println("Hasilnya:");
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
        
        // Menutup scanner
        scanner.close();
    }
}
