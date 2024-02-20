/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbogenap;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class Pbogenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.print("Masukkan pecahan pertama (pembilang penyebut): ");
            int pembilang1 = scanner.nextInt();
            int penyebut1 = scanner.nextInt();

            System.out.print("Masukkan pecahan kedua (pembilang penyebut): ");
            int pembilang2 = scanner.nextInt();
            int penyebut2 = scanner.nextInt();

            System.out.print("Masukkan pecahan ketiga (pembilang penyebut): ");
            int pembilang3 = scanner.nextInt();
            int penyebut3 = scanner.nextInt();
            
            // Operasi Penjumlahan
            int hasilPembilangTambah = (pembilang1 * penyebut2 * penyebut3) +
                    (pembilang2 * penyebut1 * penyebut3) +
                    (pembilang3 * penyebut1 * penyebut2);
            int hasilPenyebutTambah = penyebut1 * penyebut2 * penyebut3;
            // Operasi Pengurangan
            int hasilPembilangKurang = (pembilang1 * penyebut2 * penyebut3) -
                    (pembilang2 * penyebut1 * penyebut3) -
                    (pembilang3 * penyebut1 * penyebut2);
            int hasilPenyebutKurang = penyebut1 * penyebut2 * penyebut3;
            // Operasi Perkalian
            int hasilPembilangKali = pembilang1 * pembilang2 * pembilang3;
            int hasilPenyebutKali = penyebut1 * penyebut2 * penyebut3;
            // Operasi Pembagian
            int hasilPembilangBagi = pembilang1 * penyebut2 * penyebut3;
            int hasilPenyebutBagi = penyebut1 * pembilang2 * pembilang3;

            System.out.println("Hasil Penjumlahan dari ketiga pecahan: " + hasilPembilangTambah + "/" + hasilPenyebutTambah);
            System.out.println("Hasil Pengurangan dari ketiga pecahan: " + hasilPembilangKurang + "/" + hasilPenyebutKurang);
            System.out.println("Hasil Perkalian dari ketiga pecahan: " + hasilPembilangKali + "/" + hasilPenyebutKali);
            System.out.println("Hasil Pembagian dari ketiga pecahan: " + hasilPembilangBagi + "/" + hasilPenyebutBagi);
        } finally {
            // Menutup Scanner
            scanner.close();
        }
    }
}
