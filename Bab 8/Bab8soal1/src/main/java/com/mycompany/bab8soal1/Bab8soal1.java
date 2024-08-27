/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;
import java.util.Scanner;

/**
 *
 * @author halimah
 */
public class Bab8soal1 {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();
        
        if (nilaiAkhir < nilaiAwal) {
            System.out.println("Nilai akhir harus lebih besar dari nilai awal.");
             return;
        }
        
        // Menampilkan hasil dengan pertambahan 5
        int counter = 1; // untuk nomor urut
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(counter + ". " + i);
            counter++;
        }
        
        scanner.close();
    }
}
