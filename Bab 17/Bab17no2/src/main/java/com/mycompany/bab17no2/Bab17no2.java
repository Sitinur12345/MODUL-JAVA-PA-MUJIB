/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17no2;

/**
 *
 * @author halimah
 */
public class Bab17no2 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat array multidimensi untuk nama negara dan ibukotanya
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses dan menampilkan data dari array
        for (int i = 0; i < negaraIbukota.length; i++) {
            String negara = negaraIbukota[i][0];
            String ibukota = negaraIbukota[i][1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
}
