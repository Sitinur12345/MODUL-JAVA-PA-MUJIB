/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;
import java.util.Scanner;

/**
 *
 * @author halimah
 */
public class Bab9soal2 {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.print("Masukan bilangan akhir: ");
        int akhir = scanner.nextInt();
        
        System.out.print("Hasil deret bilangan: ");
        for (int i = awal; i <= akhir; i += 5) 
        {
            System.out.print(i);
            if (i + 5 <= akhir) 
            {
                System.out.print(", ");
            }
            
        }
    }
}
