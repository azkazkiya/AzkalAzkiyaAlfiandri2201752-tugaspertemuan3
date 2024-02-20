/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbogenap;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class Pbogenap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input karakter 'X'
        System.out.print("Masukkan karakter: ");
        char karakterX = scanner.next().charAt(0);

        // Input karakter 'y'
        System.out.print("Masukkan karakter: ");
        char karakterY = scanner.next().charAt(0);

        // Mendapatkan kode ASCII untuk karakter 'X' dan 'y'
        int kodeASCII_X = (int) karakterX;
        int kodeASCII_Y = (int) karakterY;

        // Menjumlahkan kode ASCII
        int hasilJumlahKodeASCII = kodeASCII_X + kodeASCII_Y;

        // Menampilkan hasil
        System.out.println("Kode ASCII untuk karakter 'X': " + kodeASCII_X);
        System.out.println("Kode ASCII untuk karakter 'y': " + kodeASCII_Y);
        System.out.println("Hasil penjumlahan kode ASCII 'X' dan 'y': " + hasilJumlahKodeASCII);

        // Menutup Scanner
        scanner.close();
    }
}
