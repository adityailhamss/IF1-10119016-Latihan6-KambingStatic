/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan6.kambingstatic;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara
 * implementasi pada dua kelas
 */

public class IF110119016Latihan6KambingStatic {

// NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
    IF110119016Latihan6Mamalia.jumlahKambing = 485000;
    System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + 
            IF110119016Latihan6Mamalia.jumlahKambing);
    }
   
}
