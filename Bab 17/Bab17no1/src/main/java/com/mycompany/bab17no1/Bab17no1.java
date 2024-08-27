/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17no1;
import java.util.Scanner;

/**
 *
 * @author halimah
 */
public class Bab17no1 {

    public static void main(String[] args) {
    // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        
        // Menerima input jumlah kota dari pengguna
        System.out.print("Masukan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Membuat array untuk menyimpan nama kota
        String[] kotaArray = new String[jumlahKota];
        
        // Menerima nama kota dari pengguna
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kotaArray[i] = scanner.nextLine();
        }
        
        // Menampilkan nama kota yang dimasukkan
        System.out.println("Kota-kota yang dimasukkan:");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }
        
        scanner.close();
    }
}
