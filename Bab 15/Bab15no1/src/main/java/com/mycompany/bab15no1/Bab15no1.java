/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15no1;

/**
 * Kelas Bab15soall1 dengan berbagai metode operasi matematika.
 */

/**
 *
 * @author halimah
 */
public class Bab15no1 {

    // Method pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Method pembagian
    public float pembagian(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
        return a / b;
    }
    
    // Method perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }

    // Method utama untuk menguji metode Bab15soall1
    public static void main(String[] args) {
        // Membuat objek Bab15soall1
        Bab15no1 obj = new Bab15no1();
        
        // Menampilkan hasil pertambahan
        System.out.println("Pertambahan: " + obj.pertambahan(40, 15));
        
        // Menampilkan hasil pengurangan
        System.out.println("Pengurangan: " + obj.pengurangan(150, 78));
        
        // Menampilkan hasil pembagian
        try {
            System.out.println("Pembagian: " + obj.pembagian(53.0f, 8.0f));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        // Menampilkan hasil perkalian
        System.out.println("Perkalian: " + obj.perkalian(16.0f, 5.0f));
    }
}
